// u05_kontrollstruktur
// auf5.32b

public class LineareAbschreibung2 
{
    public static void main(String[] args) 
    {
        // Initialwerte festlegen
        int neuwert = 1000;
        int nutzungsdauer = 5;
        
        // AfA-Betrag berechnen (ganzzahlige Division)
        int afaBetrag = neuwert / nutzungsdauer;
        
        // Überschrift und Startwerte ausgeben
        System.out.println("Abschreibung");
        System.out.println("Neuwert: " + neuwert);
        System.out.println("Nutzungsdauer: " + nutzungsdauer + " Jahre");
        System.out.println();
        
        // Tabellenüberschrift
        System.out.println("Jahr  Anfangswert  AfA  Restwert");
        
        // Anfangswert startet beim Neuwert
        int anfangswert = neuwert;
        
        // Schleife für jedes Jahr
        for (int jahr = 1; jahr <= nutzungsdauer; jahr++) 
        {
            // Restwert berechnen
            int restwert = anfangswert - afaBetrag;
            
            // Ausgabe mit printf für gleichmäßige Ausrichtung
            System.out.printf("%-8d%-11d%-5d%-6d\n", jahr, anfangswert, afaBetrag, restwert);
            
            // Anfangswert für nächstes Jahr wird zum aktuellen Restwert
            anfangswert = restwert;
        }
    }
}
