import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung {
    // Objekte
    private Textfeld hatTextfeld1;
    private Textfeld hatTextfeld2;
    private Textfeld hatTextfeld3;
    private Etikett hatEtikett1, hatEtikett2, hatEtikett3;
    private Knopf hatKnopf1, hatKnopf2, hatKnopf3, hatKnopfSortiere, hatKnopfGrößerKleiner;
    private Zeilenbereich hatZeilenbereich;
    private double ergebnis = 0, wert1 = 0, größte = 0, kleinste = 0;
    private int wert2 = 0, wert3 = 0, in = 0;
    private double[] moma;
    private boolean boolwert2 = false, boolgrößer = false;
    private int i = 0;
    private int lL;

    // Attribute

    public SuMAnwendung() {
        // Initialisierung der Oberklasse
        super(1697, 971);

        hatTextfeld1 = new Textfeld(23, 23, 100, 25, "");
        hatEtikett1 = new Etikett(123, 23, 200, 25, "<- Wert zum eintragen");
        // Ausrichtung
        hatTextfeld1.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld2 = new Textfeld(23, 48, 100, 25, "");
        hatEtikett2 = new Etikett(123, 48, 200, 25, "<- Index (nur auf Knopfdruck)");
        // Ausrichtung
        hatTextfeld2.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld3 = new Textfeld(300, 23, 100, 25, "");
        hatEtikett3 = new Etikett(400, 23, 200, 25, "<- Länge des Arrays");
        hatKnopf1 = new Knopf(23, 69, 150, 25, "Zahl eintragen");
        hatKnopf1.setzeBearbeiterGeklickt("hatKnopf1Geklickt");
        hatKnopf2 = new Knopf(173, 69, 300, 25, "bestimmten Wert verändern");
        hatKnopf2.setzeBearbeiterGeklickt("hatKnopf2Geklickt");
        hatKnopf3 = new Knopf(300, 48, 250, 25, "Länge des Arrays festlegen");
        hatKnopf3.setzeBearbeiterGeklickt("hatKnopf3Geklickt");
        hatKnopfSortiere = new Knopf(450, 69, 250, 25, "Array sortieren");
        hatKnopfSortiere.setzeBearbeiterGeklickt("hatKnopfSortiereGeklickt");
        hatKnopfGrößerKleiner = new Knopf(450, 100, 250, 25, "Größte und kleinste Zahl Ausgabe");
        hatKnopfGrößerKleiner.setzeBearbeiterGeklickt("hatKnopfGrößerKleinerGeklickt");
        hatZeilenbereich = new Zeilenbereich(23, 130, 500, 800, "Ausgabe \n");
        // Ausrichtung
    }

    public void hatKnopfGrößerKleinerGeklickt() {
        if (moma != null && moma.length > 0) {
            größte = moma[0];
            kleinste = moma[0];

            for (int h = 1; h < moma.length; h++) {
                if (moma[h] > größte) {
                    größte = moma[h];
                }
                if (moma[h] < kleinste) {
                    kleinste = moma[h];
                }
            }

            hatZeilenbereich.haengeAn("Die größte Zahl ist " + größte);
            hatZeilenbereich.haengeAn("Die kleinste Zahl ist " + kleinste);
        } else {
            hatZeilenbereich.haengeAn("Array ist nicht initialisiert oder leer.");
        }
    }

    public void hatKnopfSortiereGeklickt() 
    {
        if (moma != null && moma.length > 1)
        {
    
            boolean boolTausch = true;
            while (boolTausch) 
            {
                boolTausch = false;
                for (int i = 0; i < moma.length - 1; i++) 
                {
                    if (moma[i] > moma[i + 1]) 
                    {
                        double temp = moma[i];
                        moma[i] = moma[i + 1];
                        moma[i + 1] = temp;
                        boolTausch = true;
                    }
                }
            }
            ausgabe();
        }
        else 
        {
            hatZeilenbereich.haengeAn("Ein Fehler ist aufgetreten oder der Array hat weniger als zwei Elemente.");
        }
    }

    

    public void hatKnopf3Geklickt() {
        wert3 = hatTextfeld3.inhaltAlsGanzeZahl();
        moma = new double[wert3];
        lL = moma.length;
        ausgabe();
    }

    public void hatKnopf2Geklickt() {
        boolwert2 = !boolwert2;
    }

    public void hatKnopf1Geklickt() {
        arrayMach();
        ausgabe();
    }

    public void arrayMach() {
        wert1 = hatTextfeld1.inhaltAlsZahl();

        if (boolwert2) {
            if (i < moma.length) {
                wert2 = hatTextfeld2.inhaltAlsGanzeZahl();
                moma[wert2] = wert1;
            } else {
                hatZeilenbereich.haengeAn("Ungültiger Index");
                return;
            }
        } else {
            if (i < moma.length) {
                moma[i] = wert1;
                i++;
            } else {
                hatZeilenbereich.haengeAn("Kein Platz mehr im Array");
                return;
            }
        }
    }

    public void ausgabe() {
        hatZeilenbereich.loescheAlles();
        for (int u = 0; u < moma.length; u++) {
            hatZeilenbereich.haengeAn("moma von [" + u + "] ist " + moma[u]);
        }
    }
}

