import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class WielomianTest
{
    public WielomianTest(){
        System.out.println("(1)");
    }
    
    @BeforeAll
    public static void setUpClass()
    {
        System.out.println("(2)");
    }
    
    @AfterAll
    public static void tearDownClass()
    {
        System.out.println("(3)");
    }
    
    @BeforeEach
    public void setUp()
    {
         System.out.println("(4)");
    }
    
    @AfterEach
    public void tearDown() 
    {
        System.out.println("(5)");
    }

    @Test
    public void testgetAtX1()
    {
        System.out.println("(testujemy getAtX po raz pierwszy)");
        Wielomian testowy = new Wielomian(1, 0, 0);
        double expected = 1;
        double delta = 0.001;
        assertEquals(expected, testowy.getAtX(1), delta);
    }
        
    @Test
    public void testgetAtX2()
    {
        System.out.println("(testujemy getAtX po raz drugi");
        Wielomian testowy = new Wielomian(1, 2);
        double expected = 8;
        double delta = 0.001;
        assertEquals(expected, testowy.getAtX(2), delta);
    }

    @Test
    public void testsetABC1()
    {
        System.out.println("(testujemy setABC po raz pierwszy");
        Wielomian testowy = new Wielomian(0);
        testowy.setABC(1, 1, 1);
        double a = 1, b = 1, c = 1;
        
        assertEquals(a, testowy._a);
        assertEquals(b, testowy._b);
        assertEquals(c, testowy._c);
    }

    @Test
    public void testsetABC2()
    {
        System.out.println("(testujemy setABC po raz drugi");
        Wielomian testowy = new Wielomian(0, 0, 0);
        testowy.setABC(5, 6, 6);
        double a = 5, b = 6, c = 6;
        
        assertEquals(a, testowy._a);
        assertEquals(b, testowy._b);
        assertEquals(c, testowy._c);
    }

    @Test
    public void testintegral1()
    {
        System.out.println("(testujemy calkowanie po raz pierwszy");
        double expected = 9;
        double delta = 0.001;

        Wielomian testowy = new Wielomian(1);
        assertEquals(expected, testowy.integral(0, 3));
    }

    @Test
    public void testintegral2()
    {
        System.out.println("(testujemy calkowanie po raz drugi");
        double expected = 18;
        double delta = 0.001;

        Wielomian testowy = new Wielomian(1, 2);
        assertEquals(expected, testowy.integral(0, 3));
    }

    @Test
    public void testintegral3()
    {
        System.out.println("(testujemy calkowanie po raz trzeci");
        double expected = 27;
        double delta = 0.001;

        Wielomian testowy = new Wielomian(1, 2, 3);
        assertEquals(expected, testowy.integral(0, 3));
    }

    @Test
    public void testintegral4()
    {
        System.out.println("(testujemy calkowanie po raz czwarty");
        double expected = 39;
        double delta = 0.001;

        Wielomian testowy = new Wielomian(3, 2, 1);
        assertEquals(expected, testowy.integral(0, 3));
    }
}