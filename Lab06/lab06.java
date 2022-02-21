public class lab06
{
    public static void main(String args[])
    {
        Wielomian first = new Wielomian(1);
        Wielomian second = new Wielomian(1, 2);
        Wielomian third = new Wielomian(1, 2, 3);

        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());

        System.out.println("Values at points:");

        System.out.println(first.getAtX(1));
        System.out.println(second.getAtX(2));
        System.out.println(third.getAtX(3));

        System.out.println("Integral results:");

        System.out.println(first.integral(0, 3));
        System.out.println(second.integral(0, 3));
        System.out.println(third.integral(0, 3));

        Wielomian fourth = new Wielomian(3, 2, 1);
        System.out.println(fourth.integral(0, 3));
    }
}