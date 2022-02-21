import java.lang.Math.*;

public class lab00
{
	public static void main(String[] args)
	{
		double a = 1.7;
		double b = 1.2;
		double h = 1.3;
		
		double x;
		double y;
		
		for(double t = 1.4; t <= 29.65; t+=0.001)
		{
			x  = (a-b)*Math.cos(t) + h * Math.cos(((a-b)/b)*t);
			y = (a-b)* Math.sin(t) - h * Math.sin(((a-b)/b)*t);
			System.out.println(x + "	" + y);
		}
	}
}
