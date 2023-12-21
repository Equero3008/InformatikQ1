
/**
 * @author 
 * @version 
 */
public class Rechner
{
    // Bezugsobjekte

    // Attribute
    int i = 1;
    // Konstruktor
    public Rechner()
    {
        
    }

    // Dienste
    public int berechne(int pZahl, int pWiederholungen)
    {
        
        while (i < pWiederholungen)
        {
            pZahl = pZahl * 2;
            i++;
        }
        int ergebnis = pZahl; 
        return ergebnis;
    }
    
}
