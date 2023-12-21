/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 13.8.2023
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettAusgabe;
    private Knopf hatKnopfVerarbeitung;
    private Textfeld hatTextfeldEingabe;

    int zahl;
    int ergebnis;
    // Attribute

    /**
     * Konstruktor
     */
        public SuMAnwendung()
        {
            //Initialisierung der Oberklasse
            super(1735, 989);
    
            hatEtikettAusgabe = new Etikett(23, 94, 438, 33, "Ausgabe");
            // Ausrichtung
            hatEtikettAusgabe.setzeAusrichtung(Ausrichtung.LINKS);
            hatKnopfVerarbeitung = new Knopf(23, 59, 437, 33, "Verarbeitung");
            hatKnopfVerarbeitung.setzeBearbeiterGeklickt("hatKnopfVerarbeitungGeklickt");
            hatTextfeldEingabe = new Textfeld(23, 23, 435, 33, "Eingabe");
            // Ausrichtung
            hatTextfeldEingabe.setzeAusrichtung(Ausrichtung.LINKS);
            zahl = 0;
            ergebnis = 0;
        }
    
    /**
     * Vorher: Ereignis GeklicktvonhatKnopfVerarbeitung fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
        public void hatKnopfVerarbeitungGeklickt()
        {
            //    Schreiben Sie hier den Text ihres Dienstes
            zahl = hatTextfeldEingabe.inhaltAlsGanzeZahl();
            ergebnis = zahl*10;
            hatEtikettAusgabe.setzeInhalt("Das zehnfache deiner Zahl ist " + ergebnis);
        }

}
