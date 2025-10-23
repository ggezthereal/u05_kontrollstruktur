// u05_kontrollstruktur
// auf5.33 Zusatzaufgabe

public class Annuitaetentilgung1 
{
    public static void main(String[] args) 
    {
        // Deklaration, Initialwerte festlegen
        int kredit = 1735;
        int zinssatz = 10;
        int annuitaet = 999;
        
        // Überschrift ausgeben
        System.out.println("Annuitaetentilgung");
        
        // Restschuld startet bei der Kredithöhe
        int restschuld = kredit;
        int jahr = 1;
        
        // Schleife läuft solange Restschuld vorhanden ist
        while (restschuld > 0) {
            // Zinsen für dieses Jahr berechnen
            int zinsen = restschuld * zinssatz / 100;
            
            // Tilgung berechnen
            int tilgung = annuitaet - zinsen;
            
            // Zahlung ist normalerweise die Annuität
            int zahlung = annuitaet;
            
            // Im letzten Jahr: Zahlung darf nicht größer als Restschuld + Zinsen sein
            if (tilgung >= restschuld) 
            {
                tilgung = restschuld;
                zahlung = zinsen + tilgung;
            }
            
            // Ausgabe für dieses Jahr
            System.out.println("Jahr " + jahr + "  Restschuld " + restschuld + "  Zinsen  " + zinsen + "  Tilgung " + tilgung + "  Zahlung " + zahlung);
            
            // Restschuld für nächstes Jahr reduzieren
            restschuld = restschuld - tilgung;
            
            // Jahr erhöhen
            jahr++;
        }
    }
}
