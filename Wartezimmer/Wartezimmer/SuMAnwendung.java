/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 11.1.2024
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettName;
    private Etikett hatEtikettVorname;
    private Etikett hatEtikettKrankenkassekarte;
    private Textfeld hatTextfeld1;
    private Textfeld hatTextfeld2;
    private Textfeld hatTextfeld3;
    private Zeilenbereich hatZeilenbereich1;
    private Knopf hatKnopfEintragen;
    private Knopf hatKnopfAustragen;
    private Knopf hatKnopfBeenden;
    private Patient hatPatient;
    private Wartezimmer hatWartezimmer;
    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1697, 971);
        
        hatEtikettName = new Etikett(23, 23, 200, 25, "Name");
        // Ausrichtung
        hatEtikettName.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettVorname = new Etikett(23, 48, 200, 25, "Vorname");
        // Ausrichtung
        hatEtikettVorname.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettKrankenkassekarte = new Etikett(23, 73, 200, 25, "Krankenkassekarte");
        // Ausrichtung
        hatEtikettKrankenkassekarte.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld1 = new Textfeld(223, 23, 200, 25, "");
        // Ausrichtung
        hatTextfeld1.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld2 = new Textfeld(223, 48, 200, 25, "");
        // Ausrichtung
        hatTextfeld2.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld3 = new Textfeld(223, 73, 200, 25, "");
        // Ausrichtung
        hatTextfeld3.setzeAusrichtung(Ausrichtung.LINKS);
        hatZeilenbereich1 = new Zeilenbereich(223, 123, 200, 400, "");
        hatKnopfEintragen = new Knopf(23, 123, 150, 25, "Eintragen");
        hatKnopfEintragen.setzeBearbeiterGeklickt("hatKnopfEintragenGeklickt");
        hatKnopfAustragen = new Knopf(23, 148, 150, 25, "Austragen");
        hatKnopfAustragen.setzeBearbeiterGeklickt("hatKnopfAustragenGeklickt");
        hatKnopfBeenden = new Knopf(23, 173, 150, 25, "Beenden");
        hatKnopfBeenden.setzeBearbeiterGeklickt("hatKnopfBeendenGeklickt");
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfEintragen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfEintragenGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfAustragen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAustragenGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfBeenden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfBeendenGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

}
