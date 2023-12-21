
/**
 * @author 
 * @version 
 */
public class Rechner
{
    // Bezugsobjekte

    // Attribute
    int n;
    int i=1;
    int a;

    // Konstruktor
    public Rechner(int pn,int pa)
    {
        n=pn;
        a=pa;
    }

    // Dienste
    public int zahlenberechnung()
    {
        while(i<n)
        {
            a=2*a;
            i++;
        }
        return a;
    }
    

}
