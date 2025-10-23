// u05_kontrollstruktur
// auf5.40

import java.io.*;

public class NeuerGeldautomat 
{
    public static void main(String[] args) throws Exception 
    {
        // Eingabeleser erstellen
        InputStreamReader eingabeLeser = new InputStreamReader(System.in);
        BufferedReader pufferLeser = new BufferedReader(eingabeLeser);
        
        // Deklaration für verfügbare Scheine (jeweils 10 Stück zu Beginn)
        int verfuegbareFuenfzig = 10; // Anzahl der 50-Euro-Scheine
        int verfuegbareZwanzig = 10;  // Anzahl der 20-Euro-Scheine
        int verfuegbareZehn = 10;     // Anzahl der 10-Euro-Scheine
        
        // Schleife, die läuft, solange Scheine im Automaten verfügbar sind
        while (verfuegbareFuenfzig > 0 || verfuegbareZwanzig > 0 || verfuegbareZehn > 0) 
        {
            // Deklaration für die benötigte Anzahl der Scheine pro Auszahlung
            int anzahlFuenfzig = 0; // Anzahl der benötigten 50-Euro-Scheine
            int anzahlZwanzig = 0;  // Anzahl der benötigten 20-Euro-Scheine
            int anzahlZehn = 0;     // Anzahl der benötigten 10-Euro-Scheine
            
            // Ausgabe der Eingabeaufforderung
            System.out.println("Wieviel wollen Sie abheben?");
            // Eingabe des Betrags
            String eingabe = pufferLeser.readLine();
            // Konvertierung der Eingabe (String) in eine Ganzzahl
            int betrag = Integer.parseInt(eingabe);
            
            // Prüfen, ob der Betrag positiv und durch 10 teilbar ist
            if (betrag <= 0 || betrag % 10 != 0) 
            {
                // Fall 1: Betrag ist ungültig (negativ, null oder nicht durch 10 teilbar, z. B. 5 Euro)
                System.out.println("Auszahlung nicht moeglich");
            } else 
              {
                // Berechnung der benötigten 50-Euro-Scheine
                anzahlFuenfzig = Math.min(betrag / 50, verfuegbareFuenfzig);
                int restbetrag = betrag - (anzahlFuenfzig * 50); // Restbetrag nach 50er-Scheinen
                
                // Berechnung der benötigten 20-Euro-Scheine
                anzahlZwanzig = Math.min(restbetrag / 20, verfuegbareZwanzig);
                restbetrag = restbetrag - (anzahlZwanzig * 20); // Restbetrag nach 20er-Scheinen
                
                // Berechnung der benötigten 10-Euro-Scheine
                anzahlZehn = Math.min(restbetrag / 10, verfuegbareZehn);
                restbetrag = restbetrag - (anzahlZehn * 10); // Restbetrag nach 10er-Scheinen
                
                // Prüfen, ob der gesamte Betrag ausgezahlt werden konnte
                if (restbetrag != 0) 
                {
                    // Fall 2 oder 3: Betrag ist nicht auszahlbar (entweder zu hoch oder keine passenden Scheine)
                    System.out.println("Auszahlung nicht moeglich");
                } else 
                  {
                    // Auszahlung ist möglich, Scheine werden abgezogen
                    verfuegbareFuenfzig -= anzahlFuenfzig;
                    verfuegbareZwanzig -= anzahlZwanzig;
                    verfuegbareZehn -= anzahlZehn;
                    
                    // Ausgabe der Ergebnisse
                    System.out.println("Ausgabe:");
                    System.out.println(anzahlFuenfzig + " Fuenfzig-Euro-Scheine");
                    System.out.println(anzahlZwanzig + " Zwanzig-Euro-Scheine");
                    System.out.println(anzahlZehn + " Zehn-Euro-Scheine");
                  }
               }
            
            // Prüfen, ob der Automat leer ist
            if (verfuegbareFuenfzig == 0 && verfuegbareZwanzig == 0 && verfuegbareZehn == 0) 
            {
                System.out.println("Geldautomat ist leer");
                break; // Schleife beenden, da keine Scheine mehr verfügbar sind
            }
        }
    }
}