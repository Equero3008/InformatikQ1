import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;
/**
 * @author 
 * @version 
 */
public class Taschenrechner
{
    // Bezugsobjekte

    // Attribute
    Rechner hatRechner;
    // Konstruktor
    public Taschenrechner()
    {
        hatRechner = new Rechner();
    }
    public double berechne(double pGewicht, double pGroesse, double pAlter, boolean pFrau, boolean pMann)
    {
        /** 
        *   655,1 + (9,6 x Körpergewicht in kg) + (1,8 x Körpergröße in cm) – (4,7 x Alter in Jahren)
        */
       double zErgebnis;
       zErgebnis = 655.1+(9.6*pGewicht)+(1.8*pGroesse)-(4.7*pAlter);
       if(pMann == true)
       {
           zErgebnis = zErgebnis*1.1;
       }
       zErgebnis = hatRechner.gerundet(zErgebnis);
       return zErgebnis;
    }

}
