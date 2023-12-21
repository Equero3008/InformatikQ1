 

/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 17.10.2023
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatErgebnis;
    private Knopf hatKnopfAusrechnen;
    Rechner hatRechner;
    Rechner2 hatRechner2;
    // Attribute


    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1697, 971);
        
        
        hatRechner = new Rechner();
        hatRechner2 = new Rechner2();
        hatErgebnis = new Etikett(23, 48, 150, 25, "");
        // Ausrichtung
        hatErgebnis.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfAusrechnen = new Knopf(23, 23, 150, 25, "Ausrechnen");
        hatKnopfAusrechnen.setzeBearbeiterGeklickt("hatKnopfAusrechnenGeklickt");
    }


    public void hatKnopfAusrechnenGeklickt()
    {
        for (int i = 0; i<25 ; i++)
        {
            anhang =  anhang + "\n" + "a[" + i + "]=" + arr[i];
        }
        
        return anhang;
    }

}
