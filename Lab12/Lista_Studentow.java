import java.util.*;

public class Lista_Studentow
{
    ArrayList<Student> lista = new ArrayList<Student>();

    public void add(Student studenciak)
    {
        lista.add(studenciak);
    }

    public void add(String imie, String nazwisko, int wiek)
    {
        lista.add(new Student(imie, nazwisko, wiek));
    }


    public void wypisz_wszystkich()
    {
        for(Student studenciak : lista)
        {
            System.out.println(studenciak.getImie() + " " + studenciak.getNazwisko() + " " + studenciak.getWiek());
        }
    }

    public void sort_imie_rosnaca()
    {
        Collections.sort(lista, Comparator.comparing(Student::getImie));
    }

    public void sort_imie_malejaca()
    {
        Collections.sort(lista, Comparator.comparing(Student::getImie).reversed());
    }

    public void sort_nazwisko_rosnaca()
    {
        Collections.sort(lista, Comparator.comparing(Student::getNazwisko));
    }

    public void sort_nazwisko_malejaca()
    {
        Collections.sort(lista, Comparator.comparing(Student::getNazwisko).reversed());
    }

    public void sort_wiek_rosnaca()
    {
        Collections.sort(lista, Comparator.comparing(Student::getWiek));
    }

    public void sort_wiek_malejaca()
    {
        Collections.sort(lista, Comparator.comparing(Student::getWiek).reversed());
    }
}