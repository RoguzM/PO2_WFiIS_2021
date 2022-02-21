public class lab03
{
    public static void main(String args[])
    {
        Student first = new Student(27236, "Jan", "Nowak");

        Student second = new Student(89347, "Ela", "Kowalska");

        Student third = new Student(11111, "Janusz", "Abacki");

        Wydzial fis = new Wydzial();

        fis.dodaj(first);
        fis.dodaj(first);
        fis.dodaj(second);
        fis.dodaj(third);


        fis.display();

    }
}