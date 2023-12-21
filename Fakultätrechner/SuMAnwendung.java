import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
  
    private Textfeld hatTextfeldZahl;
    
    private Knopf hatKnopfBerechne;
    
    private Etikett hatEtikettWieoft;
    private Etikett hatEtikettErgebnisText;
    private Etikett hatEtikettErgebnis;
    
    Rechner hatRechner;
    int zahl = 0;
    int ergebnis = 0;
    
    
    // Attribute

    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1697, 971);
        
        hatRechner = new Rechner();
        
        hatEtikettWieoft = new Etikett(123, 23, 300, 25, "Von welcher Zahl soll die Fakultät berechnet werden?");
        hatEtikettWieoft.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatTextfeldZahl = new Textfeld(23, 23, 100, 25, "");
        hatTextfeldZahl.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatKnopfBerechne = new Knopf(23, 47, 400, 25, "Berechne das Ergebnis");
        hatKnopfBerechne.setzeBearbeiterGeklickt("hatKnopfBerechneGeklickt");
        
        hatEtikettErgebnisText = new Etikett(23, 70, 100, 25, "Ergebnis:");
        hatEtikettErgebnisText.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatEtikettErgebnis = new Etikett(123, 70, 300, 25, "");
        hatEtikettErgebnis.setzeAusrichtung(Ausrichtung.MITTE);
    }


    public void hatKnopfBerechneGeklickt()
    {
        ergebnis = hatRechner.berechne(hatTextfeldZahl.inhaltAlsGanzeZahl());
        hatEtikettErgebnis.setzeInhalt(ergebnis);
    }

}
