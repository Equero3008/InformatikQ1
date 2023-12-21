
    /**
     * @Enrico Kleffmann
     * @1.0
         */
import sum.komponenten.*;
import sum.ereignis.*;
import sum.werkzeuge.*;

import java.lang.System.*;   


public class SuMAnwendung extends EBAnwendung
{
    // Bezugsobjekte
    private Etikett hatEtikettAusgabe;
    
    private Textfeld hatTextfeldEingabe;
    
    private Knopf hatKnopfVerarbeitung;
    
    public Rechner rechner;
    
   
    
    
    String cr = "\n";
    String anhang = "";
    double arr[] = new double[25];
    
    public SuMAnwendung()
    {
        
        super(800, 672);
        
 
        hatTextfeldEingabe = new Textfeld(23, 210, 437, 33, "");
        hatTextfeldEingabe.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatKnopfVerarbeitung = new Knopf(23, (250) , 437, 32, "Verarbeitung");
        hatKnopfVerarbeitung.setzeBearbeiterGeklickt("hatKnopfVerarbeitungGeklickt");
        
        
        hatEtikettAusgabe = new Etikett(29, (280), 438, 33, "");
        hatEtikettAusgabe.setzeAusrichtung(Ausrichtung.LINKS);
        
        rechner = new Rechner();
    }

    // Dienste
    public void hatKnopfVerarbeitungGeklickt()
    {
        
        arrEinsatz();
        hatEtikettAusgabe.setzeInhalt(anhang);
    }
    public String arrEinsatz()
    {
        for (int i = 0; i<25 ; i++)
        {
            anhang =  anhang + "\n" + "a[" + i + "]=" + arr[i];
        }
        
        return anhang;
    }
    
}
