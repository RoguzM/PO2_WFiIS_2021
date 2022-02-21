public class Student
{
    private String _imie;
    private String _nazwisko;
    private int _wiek;

    Student()
    {
        _imie = "";
        _nazwisko = "";
        _wiek = 0;
    }

    Student(String imie, String nazwisko, int wiek)
    {
        _imie = imie;
        _nazwisko = nazwisko;
        _wiek = wiek;
    }

    public void setImie(String imie)
    {
        _imie = imie;
    }

    public void setNazwisko(String nazwisko)
    {
        _nazwisko = nazwisko;
    }

    public void setWiek(int wiek)
    {
        _wiek = wiek;
    }

    public String getImie()
    {
        return _imie;
    }

    public String getNazwisko()
    {
        return _nazwisko;
    }

    public int getWiek()
    {
        return _wiek;
    }
}