
public class Rechner2
{
    // Bezugsobjekte

    // Attribute
    int a = 0;
    int ergebnis = 0;
    // Konstruktor
    public Rechner2()
    {

    }
    public int berechne(int n)
    {
        while (1 < n)
         
        {
            a = a + 10;
            n--;
        }
        a = a + 100;
        ergebnis = a;
        a = 0;
        return ergebnis;
        
    }
    // Dienste

}
