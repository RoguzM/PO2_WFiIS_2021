/**
 * Klasa lab3string oferuje kilka ciekawych operacji na stringach. Enjoy :)
 * 
 * @author Michal Roguz
 * @version 0.1
 */
public class lab3string
{
    /**
     * Statyczna metoda zwracajaca integer w postaci dlugosci lancucha
     * @param str jest to lancuch znakowy, ktorego dlugosc chcemy uzyskac
     * @return zwraca dlugosc znakow w postaci integera
     */
    public static int dlugosc(String str)
    {
        return str.length();
    }

    /**
     * Statyczna metoda sprawdzajaca ile razy w stringu wystepuje dany znak.
     * @param str string, w ktorym patrzymy ilukrotnie wystepuje literka
     * @param literka zliczany znak w stringu
     * @return zwraca integer w postaci ilosci wystepowania literki w stringu
     */
    public static int ile_razy_literka_wystepuje(String str, char literka)
    {
        int counter = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == literka)
            {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Statyczna metoda sprawdzajaca czy dwa stringi sa identyczne
     * @param str1 string pierwszy
     * @param str2 string drugi
     * @return zwraca true albo false
     */
    public static boolean czy_takie_same(String str1, String str2)
    {
        return str1.equals(str2);
    }

    /**
     * Metoda odwracajaca string
     * @param str string, ktory chcemy odwrocic
     * @return zwraca string w odwrotnej kolejnosci
     */
    public static String wspak(String str)
    {
        String result = new String();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            result += str.charAt(i);
        }

        return result;
    }

    /**
     * Statyczna metoda zwracajaca true, gdy slowo wspak jest takie samo jak normalnie.
     * @param str string uzywany jako przyklad do sprawdzenia
     * @return true albo false, w zaleznosci czy slowo normalnie jest takie samo jak wspak
     */
    public static boolean czy_plaindrom(String str)
    {
        return str.equals(wspak(str));
    }

    /**
     * Statyczna metoda zwracajaca true, gdy literki w lancuchu sa w kolejnosc alfabetycznej
     * @param str lancuch, ktory sprawdzamy
     * @return zwraca true albo false w zaleznosci od spelnienia warunku opisanego powyzej
     */
    public static boolean czy_abecadlowe(String str)
    {
        char znak = str.charAt(0);
        boolean flag = true;

        for(int i = 0; i < str.length(); i++)
        {
            if(znak > str.charAt(i))
            {
                flag = false;
            }
        }
        return flag;
    }

    /**
     * Statyczna metoda przesuwajaca i zawijajaca string o 13 do przodu
     * @param str string, ktory kodujemy
     * @return zwracamy zakodowany o przesuniecie string
     */
    public static String rot13(String str)
    {
        String abecadlo = "abcdefghijklmnopqrstuvwxyz";
        String abecadlo_duze = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = new String();

        for(int i = 0; i < str.length(); i++)
        {
            int j = 0;
            for(j = 0; j < abecadlo.length(); j++)
            {
                if(str.charAt(i) == abecadlo.charAt(j))
                {
                    result += abecadlo.charAt((j + 13)%26);
                    break;
                }

                if(str.charAt(i) == abecadlo_duze.charAt(j))
                {
                    result += abecadlo_duze.charAt((j + 13)%26);
                    break;
                }

                if(str.charAt(i) == ' ' || str.charAt(i) == '?' || str.charAt(i) == '!')
                {
                    result+= str.charAt(i);
                    break;
                }
            }
        }
        return result;
    }
}