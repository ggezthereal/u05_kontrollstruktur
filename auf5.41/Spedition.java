// u05_kontrolstruktur
// auf5.41
import java.io.*;

/**
 * Programm zur Abwicklung der Beladung von Fahrzeugen einer Spedition
 * 
 * Zwei baugleiche Fahrzeuge:
 * - Maximales Ladegewicht: 10 Tonnen
 * - Maximales Ladevolumen: 20 m³
 * 
 * Gegenstände werden nacheinander beladen bis beide Fahrzeuge voll sind
 */
public class Spedition 
{
    
    public static void main(String[] args) throws Exception 
    {
        
        // Eingabeleser erstellen
        InputStreamReader eingabeLeser;
        BufferedReader pufferLeser;
        
        eingabeLeser = new InputStreamReader(System.in);
        pufferLeser = new BufferedReader(eingabeLeser);
        
        // Konstanten für die maximalen Kapazitäten
        final int MAX_GEWICHT = 10;
        final int MAX_VOLUMEN = 20;
        
        // Deklaration für Wagen 1
        int wagen1Gewicht;
        int wagen1Volumen;
        boolean wagen1Voll;
        
        // Deklaration für Wagen 2
        int wagen2Gewicht;
        int wagen2Volumen;
        boolean wagen2Voll;
        
        // Deklaration für die aktuelle Ladung
        int ladungGewicht;
        int ladungVolumen;
        
        // Deklaration für Hilfsvariablen
        String zeile;
        boolean beideVoll;
        
        // Initialisierung
        // Beide Wagen sind zu Beginn leer
        wagen1Gewicht = 0;
        wagen1Volumen = 0;
        wagen1Voll = false;
        
        wagen2Gewicht = 0;
        wagen2Volumen = 0;
        wagen2Voll = false;
        
        beideVoll = false;
        
        // Anfangszustand ausgeben
        System.out.println("Wagen1: Maximales Ladegewicht " + MAX_GEWICHT + ", Maximales Ladevolumen " + MAX_VOLUMEN);
        System.out.println("        Aktuelles Ladegewicht  " + wagen1Gewicht + ", Aktuelles Ladevolumen  " + wagen1Volumen);
        System.out.println("Wagen2: Maximales Ladegewicht " + MAX_GEWICHT + ", Maximales Ladevolumen " + MAX_VOLUMEN);
        System.out.println("        Aktuelles Ladegewicht  " + wagen2Gewicht + ", Aktuelles Ladevolumen  " + wagen2Volumen);
        System.out.println();
        
        // Beladungsschleife 
        // Solange nicht beide Wagen voll sind
        while (beideVoll == false) 
        {
            
            // Gewicht und Volumen der nächsten Ladung abfragen
            System.out.print("Gewicht der naechsten Ladung: ");
            zeile = pufferLeser.readLine();
            ladungGewicht = Integer.parseInt(zeile);
            
            System.out.print("Volumen der naechsten Ladung: ");
            zeile = pufferLeser.readLine();
            ladungVolumen = Integer.parseInt(zeile);
            
            // Prüfen, auf welchen Wagen die Ladung passt
            // Zuerst Wagen 1 beladen
            
            if (wagen1Voll == false && 
                wagen1Gewicht + ladungGewicht <= MAX_GEWICHT && 
                wagen1Volumen + ladungVolumen <= MAX_VOLUMEN) 
            {
                
                // Ladung passt auf Wagen 1
                wagen1Gewicht = wagen1Gewicht + ladungGewicht;
                wagen1Volumen = wagen1Volumen + ladungVolumen;
                
                System.out.println("Wagen1: Aktuelles Ladegewicht " + wagen1Gewicht + ", Aktuelles Ladevolumen " + wagen1Volumen);
                
                // Prüfen, ob Wagen 1 voll ist
                if (wagen1Gewicht == MAX_GEWICHT || wagen1Volumen == MAX_VOLUMEN) 
                {
                    wagen1Voll = true;
                    System.out.println("Wagen1 ist voll");
                }
                
            } else if (wagen2Voll == false && 
                       wagen2Gewicht + ladungGewicht <= MAX_GEWICHT && 
                       wagen2Volumen + ladungVolumen <= MAX_VOLUMEN) 
              {
                
                // Ladung passt auf Wagen 2
                wagen2Gewicht = wagen2Gewicht + ladungGewicht;
                wagen2Volumen = wagen2Volumen + ladungVolumen;
                
                System.out.println("Wagen2: Aktuelles Ladegewicht " + wagen2Gewicht + ", Aktuelles Ladevolumen " + wagen2Volumen);
                
                // Prüfen, ob Wagen 2 voll ist
                if (wagen2Gewicht == MAX_GEWICHT || wagen2Volumen == MAX_VOLUMEN) 
                {
                    wagen2Voll = true;
                    System.out.println("Wagen2 ist voll");
                }
                
            } else 
              {
                // Ladung passt auf keinen Wagen
                System.out.println("Verladung nicht moeglich");
            }
            
            System.out.println();
            
            // Prüfen, ob beide Wagen voll sind
            if (wagen1Voll == true && wagen2Voll == true) 
            {
                beideVoll = true;
                System.out.println("Beide Wagen sind voll");
            }
        }
    }
}