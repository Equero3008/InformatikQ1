public class Rechner
{
    // Bezugsobjekte

    // Attribute
    
    
    
    // Konstruktor
    public Rechner()
    {

    }

    // Dienste
    public int berechne(int pZahl)
    {
        int wert = 1;
        for(int i = pZahl; i > 0; i--)
        {
            wert = wert * i;
        
        }
        return wert;
        
    }
}