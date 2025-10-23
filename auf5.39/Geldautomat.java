// u05_kontrollstruktur
// auf5.39

import java.io.*; 

public class Geldautomat 
{
    public static void main(String[] args) throws Exception 
    {
        // Eingabeleser erstellen
        InputStreamReader eingabeLeser = new InputStreamReader(System.in);
        BufferedReader pufferLeser = new BufferedReader(eingabeLeser);
        
        // Deklaration für verfügbare Scheine (jeweils 10 Stück)
        int verfuegbareFuenfzig = 10; // Anzahl der 50-Euro-Scheine
        int verfuegbareZwanzig = 10;  // Anzahl der 20-Euro-Scheine
        int verfuegbareZehn = 10;     // Anzahl der 10-Euro-Scheine
        
        // Deklaration für die benötigte Anzahl der Scheine
        int anzahlFuenfzig = 0;       // Anzahl der benötigten 50-Euro-Scheine
        int anzahlZwanzig = 0;        // Anzahl der benötigten 20-Euro-Scheine
        int anzahlZehn = 0;           // Anzahl der benötigten 10-Euro-Scheine
        
        // Eingabeaufforderung
        System.out.println("Wieviel wollen Sie abheben?");
        // Eingabewert
        String eingabe = pufferLeser.readLine();
        // Konvertierung der Eingabe (String) in eine Ganzzahl
        int betrag = Integer.parseInt(eingabe);
        
       
        if (betrag <= 0 || betrag % 10 != 0)                             // Prüfen, ob der Betrag positiv und durch 10 teilbar ist
        {
            
            System.out.println("Auszahlung nicht moeglich");             // Wenn der Betrag ungültig ist (negativ, null oder nicht durch 10 teilbar)
        } else  
          {
            
            anzahlFuenfzig = Math.min(betrag / 50, verfuegbareFuenfzig); // Berechnung der benötigten 50-Euro-Scheine
            betrag = betrag - (anzahlFuenfzig * 50);                     // Restbetrag nach 50er-Scheinen
            
           
            anzahlZwanzig = Math.min(betrag / 20, verfuegbareZwanzig);   // Berechnung der benötigten 20-Euro-Scheine
            betrag = betrag - (anzahlZwanzig * 20);                      // Restbetrag nach 20er-Scheinen
            
                                                                   
            anzahlZehn = Math.min(betrag / 10, verfuegbareZehn);         // Berechnung der benötigten 10-Euro-Scheine
            betrag = betrag - (anzahlZehn * 10);                         // Restbetrag nach 10er-Scheinen
            
            // Prüfen, ob der gesamte Betrag ausgezahlt werden konnte
            if (betrag != 0) 
            {
                
                System.out.println("Auszahlung nicht moeglich");         // Wenn ein Restbetrag übrig ist, ist die Auszahlung nicht möglich
            } else 
              {
                // Ausgabe der Ergebnisse
                System.out.println("Ausgabe:");
                if (anzahlFuenfzig > 0) 
                {
                    System.out.println(anzahlFuenfzig + " Fuenfzig-Euro-Scheine");
                }
                if (anzahlZwanzig > 0) 
                {
                    System.out.println(anzahlZwanzig + " Zwanzig-Euro-Scheine");
                }
                if (anzahlZehn > 0) 
                {
                    System.out.println(anzahlZehn + " Zehn-Euro-Scheine");
                }
              }
           }
     }
}