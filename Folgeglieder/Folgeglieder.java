/**
 * Die Klasse Folgeglieder wurde automatisch erstellt: 
 * 
 * @author 
 * @version 12.9.2023
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class Folgeglieder extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettRechner;
    private Etikett hatEtikettErgebnis;
    private Knopf hatKnopfBerechnen;
    private Textfeld hatTextfeldA;
    private Textfeld hatTextfeldN;
    public Rechner hatRechner;

    // Attribute
    int n;
    int a;
    int Ergebnis;
    

/**
 * Konstruktor
 */
    public Folgeglieder()
    {
        //Initialisierung der Oberklasse
        super(1699, 979);

        hatEtikettRechner = new Etikett(200, 100, 100, 25, "Rechner");
        // Ausrichtung
        hatEtikettRechner.setzeAusrichtung(Ausrichtung.MITTE);
        hatEtikettErgebnis = new Etikett(200, 175, 100, 25, "Ergebnis");
        // Ausrichtung
        hatEtikettErgebnis.setzeAusrichtung(Ausrichtung.MITTE);
        hatKnopfBerechnen = new Knopf(200, 150, 100, 25, "Berechnen");
        hatKnopfBerechnen.setzeBearbeiterGeklickt("hatKnopfBerechnenGeklickt");
        hatTextfeldA = new Textfeld(150, 125, 100, 25, "a");
        // Ausrichtung
        hatTextfeldA.setzeAusrichtung(Ausrichtung.MITTE);
        hatTextfeldN = new Textfeld(250, 125, 100, 25, "n");
        // Ausrichtung
        hatTextfeldN.setzeAusrichtung(Ausrichtung.MITTE);
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfBerechnen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfBerechnenGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
        a=hatTextfeldA.inhaltAlsGanzeZahl();
        n=hatTextfeldN.inhaltAlsGanzeZahl();
        hatRechner = new Rechner(n,a);
        Ergebnis=hatRechner.zahlenberechnung();
        hatEtikettErgebnis.setzeInhalt(Ergebnis);
    }

}
