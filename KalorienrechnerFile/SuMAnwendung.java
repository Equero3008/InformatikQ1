/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 1.9.2023
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Textfeld Groesse;
    private Textfeld Gewicht;
    private Textfeld Alter;
    
    private Knopf hatKnopfMann;
    private Knopf hatKnopfFrau;
    
    private Etikett hatEtikettDeinGewichtInKg;
    private Etikett hatEtikettGroesse;
    private Etikett hatEtikettAlter;
    private Etikett hatEtikettGeschlecht;
    
    private Knopf hatKnopfRechnen;
    
    private Etikett hatEtikettzKalorien;
    private Etikett hatEtikettKalorien;
    
    Taschenrechner hatTaschenrechner;

    double gewicht;
    double groesse;
    double alter;
    double ergebnis;
    
    boolean mannGeklickt;
    boolean frauGeklickt;
    // Attribute

    /**
     * Konstruktor
     */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1735, 989);
        
        hatTaschenrechner = new Taschenrechner();
        gewicht = 0;
        groesse = 0;
        alter = 0;
        ergebnis = 0;
        mannGeklickt = false;
        frauGeklickt = false;
        
        Groesse = new Textfeld(23, 23, 200, 25, "");
        // Ausrichtung
        Groesse.setzeAusrichtung(Ausrichtung.LINKS);
        Gewicht = new Textfeld(23, 48, 200, 25, "");
        // Ausrichtung
        Gewicht.setzeAusrichtung(Ausrichtung.LINKS);
        Alter = new Textfeld(23, 73, 200, 25, "");
        // Ausrichtung
        Alter.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfMann = new Knopf(23, 100, 100, 25, "Mann");
        hatKnopfMann.setzeBearbeiterGeklickt("hatKnopfMannGeklickt");
        hatKnopfFrau = new Knopf(123, 100, 100, 25, "Frau");
        hatKnopfFrau.setzeBearbeiterGeklickt("hatKnopfFrauGeklickt");
        hatEtikettDeinGewichtInKg = new Etikett(225, 23, 150, 25, "<- Dein Gewicht in kg");
        // Ausrichtung
        hatEtikettDeinGewichtInKg.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettGroesse = new Etikett(225, 48, 150, 25, "<- Deine Größe in cm ");
        // Ausrichtung
        hatEtikettGroesse.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettAlter = new Etikett(225, 73, 150, 25, "<- Dein Alter");
        // Ausrichtung
        hatEtikettAlter.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettGeschlecht = new Etikett(225, 100, 150, 25, "<- Dein Geschlecht");
        // Ausrichtung
        hatEtikettGeschlecht.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfRechnen = new Knopf(23, 150, 353, 25, "Kalorien ausrechner");
        hatKnopfRechnen.setzeBearbeiterGeklickt("hatKnopfRechnenGeklickt");
        hatEtikettzKalorien = new Etikett(23, 180, 150, 25, "");
        // Ausrichtung
        hatEtikettzKalorien.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettKalorien = new Etikett(173, 180, 203, 25, "<- Deine Kalorien");
        // Ausrichtung
        hatEtikettKalorien.setzeAusrichtung(Ausrichtung.LINKS);
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfMann fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfMannGeklickt()
    {
        mannGeklickt = true;
        frauGeklickt = false;
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfFrau fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfFrauGeklickt()
    {
        mannGeklickt = false;
        frauGeklickt = true;
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfRechnen fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfRechnenGeklickt()
    {
        groesse = Groesse.inhaltAlsZahl();
        gewicht = Gewicht.inhaltAlsZahl();
        alter = Alter.inhaltAlsZahl();
        ergebnis = hatTaschenrechner.berechne(gewicht, groesse, alter, mannGeklickt, frauGeklickt);
        hatEtikettzKalorien.setzeInhalt("" + ergebnis);
    }

}
