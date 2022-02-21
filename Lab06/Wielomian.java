public class Wielomian
{
    public double _a;
    public double _b;
    public double _c;

    Wielomian(double a)
    {
        _a = a;
        _b = 0;
        _c = 0;
    }

    Wielomian(double a, double b)
    {
        _a = a;
        _b = b;
        _c = 0;
    }

    Wielomian(double a, double b, double c)
    {
        _a = a;
        _b = b;
        _c = c;
    }

    public String toString()
    {
        String res = "f(x)=";
        char znak_a = '-', znak_b = '+', znak_c = '+'; 
        
        if(_a != 0)
        {
            if(_a < 0)
            {
                res += znak_a;
                res += -_a;
            }
            res += _a;
        }

        res += "x^2";

        if(_b != 0)
        {
            if(_b < 0)
            {
                znak_b = '-';
                res += znak_b;
                res += -_b;
            }
            else
            {
                res += znak_b;
                res += _b;
            }
        }

        res += "x";

        if(_c != 0)
        {
            if(_c < 0)
            {
                znak_c = '-';
                res += znak_c;
                res += -_c;
            }
            else
            {
                res += znak_c;
                res += _c;
            }
        }

        return res;
    }

    public void setABC(double a, double b, double c)
    {
        _a = a;
        _b = b;
        _c = c;
    }

    public double getAtX(double x)
    {
        return _a * x * x + _b * x + _c;
    }

    public double integral(double x1, double x2)
    {
        double fx1 = _a * x1 * x1 * x1 /3 + _b * x1 * x1/2 + _c * x1;
        double fx2 = _a * x2 * x2 * x2 /3 + _b * x2 * x2/2 + _c * x2;

        return fx2 - fx1;
    }
}