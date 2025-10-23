// u05_kontrollstruktur
// auf5.36

import java.io.*;

/**
 * Programm zur Umrechnung von Euro in Pfund mit Wechselgebühr
 * Die Gebühr kann als fester Euro-Betrag oder als Prozentsatz eingegeben werden
 * ERWEITERUNG: Nun können auch mehrstellige Gebührenbeträge eingegeben werden
 * (z.B. 10 Prozent, 125 Euro)
 */

public class Pfund7 
{
    
    public static void main(String[] args) throws Exception 
    {
        
        // Eingabeleser erstellen 
        InputStreamReader eingabeLeser;
        BufferedReader pufferLeser;
        
        eingabeLeser = new InputStreamReader(System.in);
        pufferLeser = new BufferedReader(eingabeLeser);
        
        // Konstante: Umrechnungsfaktor von Euro zu Pfund
        final double FAKTOR = 0.7583;
        
                                // Deklarationen                               
        double euroBetrag;      // Variable für den zu wechselnden Euro-Betrag
        double pfundBetrag;     // Variable für den berechneten Pfund-Betrag
        double gebuehr;         // Variable für die Wechselgebühr in Euro
        double einzuzahlen;     // Variable für den Gesamtbetrag (Euro + Gebühr)
        String zeile;           // Hilfsvariablen für die Eingabe-Verarbeitung
        int gebuerenWert;
        String gebuerenArt;
        
        // Euro-Betrag eingeben
        System.out.print("Bitte den Euro-Betrag eingeben: ");
        
        // readLine() liest eine ganze Zeile als String ein
        zeile = pufferLeser.readLine();
        
        // String in double umwandeln (konvertieren)
        euroBetrag = Double.parseDouble(zeile);
        
        // Gebühr eingeben
        // Hinweistext für den Benutzer ausgeben
        System.out.println("Bitte die Gebuehr eingeben.");
        System.out.println("Eingabeform: \"x Euro\" oder \"x Prozent\"");
        System.out.println("(x kann auch mehrstellig sein, z.B. 10 Prozent oder 125 Euro)");
        
        // Die komplette Zeile einlesen (z.B. "125 Euro" oder "10 Prozent")
        zeile = pufferLeser.readLine();
        
        // ERWEITERT für mehrstellige Zahlen
        // Die Eingabe besteht aus: Zahl + Leerzeichen + Wort (z.B. "125 Euro")
        // Wir durchlaufen die Zeile Zeichen für Zeichen
        
        // Deklaration für den Zahlen-Teil als String
        String zahlenTeil = "";
        
        // Deklaration um die aktuelle Position in der Zeile zu speichern
        int position = 0;
        
        // Schleife: Zeichen für Zeichen durchgehen bis zum Leerzeichen
        // charAt(position) holt das Zeichen an der Position
        // WICHTIG: Jetzt können mehrere Ziffern vorkommen (z.B. 1, 2, 5 bei "125")
        while (zeile.charAt(position) != ' ') 
        {
            // Das aktuelle Zeichen zum zahlenTeil hinzufügen
            // Bei "125 Euro": 
            //   Erste Runde: zahlenTeil = "1"
            //   Zweite Runde: zahlenTeil = "12"
            //   Dritte Runde: zahlenTeil = "125"
            zahlenTeil = zahlenTeil + zeile.charAt(position);
            // Zur nächsten Position gehen
            position = position + 1;
        }
        
        // Jetzt steht position auf dem Leerzeichen
        // Den String-Teil in eine Zahl umwandeln
        // Bei "125 Euro" wird "125" zu der Zahl 125
        // Bei "10 Prozent" wird "10" zu der Zahl 10
        gebuerenWert = Integer.parseInt(zahlenTeil);
        
        // Das Leerzeichen überspringen (position + 1)
        position = position + 1;
        
        // Den Rest der Zeile ab dieser Position holen (das Wort "Euro" oder "Prozent")
        // substring(position) holt alle Zeichen ab position bis zum Ende
        gebuerenArt = zeile.substring(position);
        
        // Gebühr berechnen
        // Prüfen, ob die Eingabe "Euro" oder "Prozent" war
        if (gebuerenArt.equals("Euro")) 
        {
            // Gebühr ist ein fester Euro-Betrag
            // Kann jetzt auch mehrstellig sein (z.B. 125 Euro)
            gebuehr = gebuerenWert;
        } else 
          {
            // Gebühr ist ein Prozentsatz vom Euro-Betrag
            // Kann jetzt auch mehrstellig sein (z.B. 10 Prozent)
            // Formel: Gebühr = Euro-Betrag * Prozentsatz / 100
            gebuehr = euroBetrag * gebuerenWert / 100.0;
         }
        
        // Pfund-Betrag berechnen 
        // Der Euro-Betrag wird in Pfund umgerechnet
        pfundBetrag = euroBetrag * FAKTOR;
        
        // Einzuzahlenden Betrag berechnen
        // Der Kunde muss den Euro-Betrag plus die Gebühr bezahlen
        einzuzahlen = euroBetrag + gebuehr;
        
        // ===== SCHRITT 7: Ergebnisse ausgeben =====
        // Formatierte Ausgabe mit zwei Nachkommastellen
        // %8.2f bedeutet: 8 Zeichen breit, 2 Dezimalstellen
        System.out.printf("Euro-Betrag:   %8.2f Euro%n", euroBetrag);
        System.out.printf("Pfund-Betrag:  %8.2f Pfund%n", pfundBetrag);
        System.out.printf("Gebuehr:       %8.2f Euro%n", gebuehr);
        System.out.printf("Einzuzahlen:   %8.2f Euro%n", einzuzahlen);
    }
}