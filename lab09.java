import java.io.*;

public class lab09
{
    public static void main(String[] args)throws Exception
    {
        try
        {
            if(args.length < 1)
            {
                throw new Exception("Blad, nie podales pierwszego argumentu wywolania!"); 
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

        double sr = 0.0;
        int i = 0;

        try{
            BufferedReader fileread = new BufferedReader(new FileReader(args[0]));
            String numbers; 
            while((numbers = fileread.readLine()) != null)
            {
                sr += Double.parseDouble(numbers);
                i++;
            }
            
            if(i == 0)
            {
                throw new ArithmeticException(); 
            }
            else
            {
                sr = sr / i;
            }

            System.out.println(sr);
            fileread.close();
        }

        catch(IOException e)
        {
            System.out.println("Blad zwiazany z plikiem do odczytu!");
        }  

        catch(NumberFormatException e)
        {
            System.out.println("Blad, nieprawidlowy format zapisu liczb zawartych w pliku!");
        } 

        catch(ArithmeticException e)
        {
            System.out.println("Blad, mozliwy brak liczb w pliku do wyliczenia sredniej!");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Podaj plik do odczytu liczb!");
        } 
        catch(Exception e){
            System.out.println(e);
        } 
    }
}