import java.util.Vector;

public class Wydzial
{
    private Vector<Student> baza;

    Wydzial()
    {
        baza = new Vector<Student>();
    }
 

    void dodaj(Student stud)
    {
        boolean flag = false;
        for(int i = 0; i < baza.size(); i++)
        {
            if(stud.get_id() == baza.get(i).get_id())
            {
                System.out.println("Podany numer jest juz w bazie.");
                flag = true;
                break;
            }
        }

        if(!flag)
        {
            baza.add(stud);
        }
    }

    void display()
    {
        for(int i = 0; i < baza.size(); i++)
        {
            baza.get(i).display_data();
        }
    }
}