import java.util.Random;
import java.awt.Graphics;
import java.awt.Image;

public class Rnd
{
    public int k;
    public int N;
    public double tab[];
    Random r =  new Random();

    public Rnd(int a, int b)
    {
        k = a;
        N = b;
        tab = new double[k];

        for(int i = 0; i < k; i++)
        {
            double temp = 0;
            
            for(int j = 0; j < N; j++)
            {
                temp += r.nextDouble();
            }
            tab[i] = temp;
        }
    }

    public void Print()
    {
        for(int i = 0; i < k; i++)
        {
            System.out.println("[" + i + "]=" + tab[i]);
        }
    }

    public double Min()
    {
        double minimum = 100;
        for(int i = 0; i < k; i++)
        {
            if(tab[i] < minimum)
            {
                minimum = tab[i];
            }
        }
        return minimum;
    }

    public double Max()
    {
        double maximum = 0;
        for(int i = 0; i < k; i++)
        {
            if(tab[i] > maximum)
            {
                maximum = tab[i];
            }
        }
        return maximum;
    }

    public double Average()
    {
        double avg = 0;
        double sum = 0;

        for(int i = 0; i < k; i++)
        {
            sum += tab[i];
        }
        avg = sum/k;

        return avg;
    }

    public void Draw()
    {
        //Image img = new Image()
        System.out.println("Nie dziala javax.ximage.IO");
    }
}