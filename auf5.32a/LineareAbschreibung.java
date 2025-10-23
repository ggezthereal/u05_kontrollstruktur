// u05_kontrollstruktur
// auf5.32a

public class LineareAbschreibung 
{
    public static void main(String[] args) 
    {
        // Initialwerte festlegen
        int neuwert = 999;			// hier 1000 oder 999
        int nutzungsdauer = 5;
        
        // AfA-Betrag berechnen (ganzzahlige Division)
        int afaBetrag = neuwert / nutzungsdauer;
        
        // Überschrift und Startwerte ausgeben
        System.out.println("Abschreibung");
        System.out.println("Neuwert: " + neuwert);
        System.out.println("Nutzungsdauer: " + nutzungsdauer + " Jahre");
        System.out.println();
        
        // Restwert startet beim Neuwert
        int restwert = neuwert;
        
        // Schleife für jedes Jahr
        for (int jahr = 1; jahr <= nutzungsdauer; jahr++) 
        {
            // Restwert für aktuelles Jahr berechnen
            restwert = restwert - afaBetrag;
            
            // Ausgabe für dieses Jahr
            System.out.println("Jahr " + jahr + " AfA " + afaBetrag + " Restwert " + restwert);
        }
    }
}
