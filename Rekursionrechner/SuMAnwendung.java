/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 28.9.2023
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettErebnis;
    private Etikett hatEtikettWelcheRekursion;
    private Textfeld hatTextfeldZahl;
    private Knopf hatKnopfAusrechnen;
    private Etikett hatEtikettErgebnisText;
    Rechner hatRechner;
    Rechner2 hatRechner2;
    int ergebnis = 0;
    // Attribute

    /**
     * Konstruktor
     */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1697, 971);
        
        hatRechner = new Rechner();
        hatRechner2 = new Rechner2();
        hatEtikettErebnis = new Etikett(23, 73, 100, 25, "");
        // Ausrichtung
        hatEtikettErebnis.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettWelcheRekursion = new Etikett(123, 23, 150, 25, "<- Welche Rekursion");
        // Ausrichtung
        hatEtikettWelcheRekursion.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldZahl = new Textfeld(23, 23, 100, 25, "");
        // Ausrichtung
        hatTextfeldZahl.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfAusrechnen = new Knopf(23, 48, 250, 25, "Ausrechnen");
        hatKnopfAusrechnen.setzeBearbeiterGeklickt("hatKnopfAusrechnenGeklickt");
        hatEtikettErgebnisText = new Etikett(123, 73, 150, 25, "<- Dein Ergebnis");
        // Ausrichtung
        hatEtikettErgebnisText.setzeAusrichtung(Ausrichtung.LINKS);
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfAusrechnen fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfAusrechnenGeklickt()
    {
        ergebnis = hatRechner2.berechne(hatTextfeldZahl.inhaltAlsGanzeZahl());
        hatEtikettErebnis.setzeInhalt(ergebnis);
        ergebnis = 0;
    }

}
