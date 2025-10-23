// u05_kontrollstruktur
// auf5.33 Zusatzaufgabe - mit Dialogeingabe
import java.io.*;

public class Annuitaetentilgung1 
{
    public static void main(String[] args) throws Exception
    {
        // Deklariere und Initiere den InputStreamReader und BufferedReader
        InputStreamReader eingabeLeser  = new InputStreamReader(System.in);
        BufferedReader gepufferterLeser = new BufferedReader(eingabeLeser);
        
        // Überschrift ausgeben
        System.out.println("Annuitaetentilgung\n");
        
        // Dialogeingabe: Zinssatz
        System.out.print("Zinssatz:   ");
        int zinssatz = Integer.parseInt(gepufferterLeser.readLine());
        
        // Dialogeingabe: Kredit
        System.out.print("Kredit:     ");
        int kredit = Integer.parseInt(gepufferterLeser.readLine());
        
        // Dialogeingabe: Annuität
        System.out.print("Annuitaet:  ");
        int annuitaet = Integer.parseInt(gepufferterLeser.readLine());
        
        System.out.println(); // Leerzeile
        
        // Restschuld startet bei der Kredithöhe
        int restschuld = kredit;
        int jahr = 1;
        
        // Schleife läuft solange Restschuld vorhanden ist
        while (restschuld > 0) 
        {
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
            System.out.println("Jahr " + jahr + "  Restschuld " + restschuld + "  Zinsen " + zinsen + "  Tilgung " + tilgung + "  Annuitaet " + zahlung);
            
            // Restschuld für nächstes Jahr reduzieren
            restschuld = restschuld - tilgung;
            
            // Jahr erhöhen
            jahr++;
        }
    }
}
