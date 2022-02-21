import java.io.*;
import java.util.*;

public class lab11 {
    public static void main(String args[]) {
        ArrayList<String> data = new ArrayList<String>();

        try {
            BufferedReader fileread = new BufferedReader(new FileReader("slownik.dat"));

            String line;
            while ((line = fileread.readLine()) != null) {
                data.add(line);
            }
            fileread.close();
        } catch (Exception e) {
        }

        if (args.length == 1) {
            for (String p : data) {
                String[] line2 = p.split(" ");
                if (args[0].equals(line2[0])) {
                    System.out.println(line2[1]);
                    return;
                }
                if (args[0].equals(line2[1])) {
                    System.out.println(line2[0]);
                    return;
                }

            }
            System.out.println("Brak podanego slowa w slowniku");
            return;
        }
        if (args.length == 2) {
            if (args[0].equals("del")) {
                for (String p : data) {
                    String[] line2 = p.split(" ");
                    if (args[1].equals(line2[0]) || args[1].equals(line2[1])) {
                        data.remove(p);
                        break;
                    }
                }
            }
        }
        if (args.length == 3) {
            if (args[0].equals("add")) {
                data.add(args[1] + " " + args[2]);
            }
        }

        if (args.length > 3) {
            System.out.println("Blad, zbyt duza liczba argumentow!");
        }
        try {
            BufferedWriter filewrite = new BufferedWriter(new FileWriter("slownik.dat"));

            for (int i = 0; i < data.size(); i++) {
                filewrite.write(data.get(i) + "\n");
            }
            filewrite.close();
        } catch (Exception e) {
        }
    }
}