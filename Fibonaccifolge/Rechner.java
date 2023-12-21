
/**
 * @author 
 * @version 
 */
public class Rechner
{
    // Bezugsobjekte

    // Attribute
    int i = 1;
    int wert = 1;
    int lwert = 0;
    int ergebnis;
    // Konstruktor
    public Rechner()
    {

    }

    // Dienste
    public int berechne(int pZahl)
    {
        while(i < pZahl)
        {
            ergebnis = wert + lwert;
            lwert = wert;
            wert = ergebnis;
            i++;    
        }
        return ergebnis;
    }
}
