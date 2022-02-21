package Armia;

interface CzolgInterface
{
    void odbierzRozkaz(Rozkaz msg);
    void getIdentificator(Identificator id);
}

public class Czolg implements CzolgInterface
{
    String [] roz = new String[25];

    int counter = 0;

    public void odbierzRozkaz(Rozkaz msg)
    {
        roz[counter] = msg.rozkaz;
        counter++;
    }

    public void getIdentificator(Identificator id)
    {

    }

    public String toString()
    {
        String rozkazy = new String();

        for(int i = 0; i < counter; i++)
        {
            rozkazy += (roz[i]+"\n");
        }

        return rozkazy;
    }

    public String ostatniRozkaz()
    {
        return "Ostatni rozkaz do mnie: " + roz[counter - 1];
    }
}