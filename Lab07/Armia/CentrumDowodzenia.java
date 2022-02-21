package Armia;
import java.util.*;

interface CentrumDowodzeniaInterface
{
    void zarejestrujCzolg(CzolgInterface czolg);
    void wydajRozkaz(String str, Rozkaz msg);
}

public class CentrumDowodzenia implements CentrumDowodzeniaInterface
{
    CzolgInterface [] czolgi = new CzolgInterface[25];
    int counter = 0;

    public void zarejestrujCzolg(CzolgInterface czolg)
    {
        czolgi[counter] = czolg;
        counter++;
    }

    public void wydajRozkaz(String str, Rozkaz msg)
    {
        czolgi[Integer.valueOf(str) - 1].odbierzRozkaz(msg);
    }

    public String toString()
    {
        String result = new String();

        result += "Do tej pory centrum dowodzenia wyslalo nastepujace rozkazy:\n";

        for(int i = 0; i < counter; i++)
        {
            result += ("Czolg nr " + (i+1) + " otrzymal rozkazy: \n" + czolgi[i].toString() + "\n");
        }

        return result; 
    }
}