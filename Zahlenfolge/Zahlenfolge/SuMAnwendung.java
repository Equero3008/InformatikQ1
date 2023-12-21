/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 13.9.2023
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Textfeld hatTextfeld1;
    private Textfeld hatTextfeld2;
    
    private Etikett hatEtikettWiederholungen;
    private Etikett hatEtikettZahl;
    private Etikett hatEtikettErgebnisText;
    
    private Knopf hatKnopfBerechneDasErgebisDerZahlenfolgeFuerN;
    private Etikett hatEtikettErgebnis;
    
    Rechner hatRechner;
    
    int zahl;
    int wiederholungen;
    int ergebnis;

    // Attribute

    /**
     * Konstruktor
     */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1699, 979);
        
        hatRechner = new Rechner();

        hatTextfeld1 = new Textfeld(23, 23, 100, 25, "");
        hatTextfeld1.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatTextfeld2 = new Textfeld(23, 48, 100, 25, "");
        hatTextfeld2.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatEtikettZahl = new Etikett(123, 23, 300, 25, "<- Zahl zur Berechnung (a)");
        hatEtikettZahl.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatEtikettWiederholungen = new Etikett(123, 48, 400, 25, "<- Wiederholungen der Zahlenfolge (n)");
        hatEtikettWiederholungen.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatEtikettErgebnisText = new Etikett(23, 97, 200, 25, "Ergebnis:");
        hatEtikettErgebnisText.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatKnopfBerechneDasErgebisDerZahlenfolgeFuerN = new Knopf(23, 72, 300, 25, "Berechne das Ergebis der Zahlenfolge für n ");
        hatKnopfBerechneDasErgebisDerZahlenfolgeFuerN.setzeBearbeiterGeklickt("hatKnopfBerechneDasErgebisDerZahlenfolgeFuerNGeklickt");
        
        hatEtikettErgebnis = new Etikett(223, 97, 200, 25, "");
        hatEtikettErgebnis.setzeAusrichtung(Ausrichtung.LINKS);
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfBerechneDasErgebisDerZahlenfolgeFuerN fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfBerechneDasErgebisDerZahlenfolgeFuerNGeklickt()
    {
        zahl = hatTextfeld1.inhaltAlsGanzeZahl();
        wiederholungen = hatTextfeld2.inhaltAlsGanzeZahl();
        ergebnis = hatRechner.berechne(zahl, wiederholungen);
        hatEtikettErgebnis.setzeInhalt(ergebnis);
    }

}
