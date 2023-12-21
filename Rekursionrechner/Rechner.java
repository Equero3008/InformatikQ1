
/**
 * @author 
 * @version 
 */
public class Rechner
{
    // Bezugsobjekte

    // Attribute
    int a = 0;
    // Konstruktor
    public Rechner()
    {

    }
    public int berechne(int n)
    {
        if(n == 1)
        {
            a = 100;
        }
        else 
        {
            a = berechne(n-1) + 10;
        }
        return a;
    }
    // Dienste

}
