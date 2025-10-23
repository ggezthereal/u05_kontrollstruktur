// u05_kontrollstruktur
// auf5.42

import java.io.*;
import java.util.StringTokenizer;

/**
 * Programm zur Umformung einer IP-Adresse
 * 
 * Wandelt eine IP-Adresse von Dezimalschreibweise (z.B. 192.168.0.97)
 * in Binärschreibweise um (z.B. 11000000.10101000.00000000.01100001)
 * 
 * Verwendet:
 * - StringTokenizer: zum Zerlegen der IP-Adresse an den Punkten
 * - Integer.toBinaryString(): zur Umwandlung von Dezimal in Binär
 */
public class IPAdresse 
{
    
    public static void main(String[] args) throws Exception 
    {
        
        // Eingabeleser erstellen
        InputStreamReader eingabeLeser;
        BufferedReader pufferLeser;
        
        eingabeLeser = new InputStreamReader(System.in);
        pufferLeser = new BufferedReader(eingabeLeser);
        
        // Deklaration für die Eingabe
        String ipAdresse;
        
        // Deklaration für die vier Oktette (Zahlenblöcke) der IP-Adresse
        String oktett1Dezimal;
        String oktett2Dezimal;
        String oktett3Dezimal;
        String oktett4Dezimal;
        
        // Deklaration für die Binärdarstellung
        String oktett1Binaer;
        String oktett2Binaer;
        String oktett3Binaer;
        String oktett4Binaer;
        
        // Deklaration Hilfsvariable
        int zahl;
        
        // IP-Adresse eingeben
        System.out.print("IP-Adresse (dezimal): ");
        ipAdresse = pufferLeser.readLine();
        
        // P-Adresse in Oktette zerlegen
        // StringTokenizer zerlegt einen String an bestimmten Trennzeichen
        // Hier verwenden wir den Punkt "." als Trennzeichen
        // Die IP-Adresse "192.168.0.97" wird in "192", "168", "0", "97" zerlegt
        
        StringTokenizer tokenizer = new StringTokenizer(ipAdresse, ".");
        
        // Die vier Oktette auslesen
        // nextToken() gibt das nächste Token (Teilstring) zurück
        oktett1Dezimal = tokenizer.nextToken();  // "192"
        oktett2Dezimal = tokenizer.nextToken();  // "168"
        oktett3Dezimal = tokenizer.nextToken();  // "0"
        oktett4Dezimal = tokenizer.nextToken();  // "97"
        
        // Jedes Oktett in Binärdarstellung umwandeln        
        // Oktett 1 umwandeln
        zahl = Integer.parseInt(oktett1Dezimal);       // String "192" → Zahl 192
        oktett1Binaer = Integer.toBinaryString(zahl);  // 192 → "11000000"
        
        // Oktett 2 umwandeln
        zahl = Integer.parseInt(oktett2Dezimal);       // String "168" → Zahl 168
        oktett2Binaer = Integer.toBinaryString(zahl);  // 168 → "10101000"
        
        // Oktett 3 umwandeln
        zahl = Integer.parseInt(oktett3Dezimal);       // String "0" → Zahl 0
        oktett3Binaer = Integer.toBinaryString(zahl);  // 0 → "0"
        
        // Oktett 4 umwandeln
        zahl = Integer.parseInt(oktett4Dezimal);       // String "97" → Zahl 97
        oktett4Binaer = Integer.toBinaryString(zahl);  // 97 → "1100001"
        
        // Auf 8 Stellen auffüllen
        // toBinaryString() liefert keine führenden Nullen
        // Beispiel: 0 wird zu "0" statt "00000000"
        // Beispiel: 97 wird zu "1100001" statt "01100001"
        // Wir müssen also vorne Nullen ergänzen mit einer if-else-Kette
        
        // Oktett 1 auf 8 Stellen bringen
        if (oktett1Binaer.length() == 1) {
            oktett1Binaer = "0000000" + oktett1Binaer;
        } else if (oktett1Binaer.length() == 2) {
            oktett1Binaer = "000000" + oktett1Binaer;
        } else if (oktett1Binaer.length() == 3) {
            oktett1Binaer = "00000" + oktett1Binaer;
        } else if (oktett1Binaer.length() == 4) {
            oktett1Binaer = "0000" + oktett1Binaer;
        } else if (oktett1Binaer.length() == 5) {
            oktett1Binaer = "000" + oktett1Binaer;
        } else if (oktett1Binaer.length() == 6) {
            oktett1Binaer = "00" + oktett1Binaer;
        } else if (oktett1Binaer.length() == 7) {
            oktett1Binaer = "0" + oktett1Binaer;
        }

        // Wenn schon 8 Stellen: nichts tun     
        // Oktett 2 auf 8 Stellen bringen
        if (oktett2Binaer.length() == 1) {
            oktett2Binaer = "0000000" + oktett2Binaer;
        } else if (oktett2Binaer.length() == 2) {
            oktett2Binaer = "000000" + oktett2Binaer;
        } else if (oktett2Binaer.length() == 3) {
            oktett2Binaer = "00000" + oktett2Binaer;
        } else if (oktett2Binaer.length() == 4) {
            oktett2Binaer = "0000" + oktett2Binaer;
        } else if (oktett2Binaer.length() == 5) {
            oktett2Binaer = "000" + oktett2Binaer;
        } else if (oktett2Binaer.length() == 6) {
            oktett2Binaer = "00" + oktett2Binaer;
        } else if (oktett2Binaer.length() == 7) {
            oktett2Binaer = "0" + oktett2Binaer;
        }
        
        // Oktett 3 auf 8 Stellen bringen
        if (oktett3Binaer.length() == 1) {
            oktett3Binaer = "0000000" + oktett3Binaer;
        } else if (oktett3Binaer.length() == 2) {
            oktett3Binaer = "000000" + oktett3Binaer;
        } else if (oktett3Binaer.length() == 3) {
            oktett3Binaer = "00000" + oktett3Binaer;
        } else if (oktett3Binaer.length() == 4) {
            oktett3Binaer = "0000" + oktett3Binaer;
        } else if (oktett3Binaer.length() == 5) {
            oktett3Binaer = "000" + oktett3Binaer;
        } else if (oktett3Binaer.length() == 6) {
            oktett3Binaer = "00" + oktett3Binaer;
        } else if (oktett3Binaer.length() == 7) {
            oktett3Binaer = "0" + oktett3Binaer;
        }
        
        // Oktett 4 auf 8 Stellen bringen
        if (oktett4Binaer.length() == 1) {
            oktett4Binaer = "0000000" + oktett4Binaer;
        } else if (oktett4Binaer.length() == 2) {
            oktett4Binaer = "000000" + oktett4Binaer;
        } else if (oktett4Binaer.length() == 3) {
            oktett4Binaer = "00000" + oktett4Binaer;
        } else if (oktett4Binaer.length() == 4) {
            oktett4Binaer = "0000" + oktett4Binaer;
        } else if (oktett4Binaer.length() == 5) {
            oktett4Binaer = "000" + oktett4Binaer;
        } else if (oktett4Binaer.length() == 6) {
            oktett4Binaer = "00" + oktett4Binaer;
        } else if (oktett4Binaer.length() == 7) {
            oktett4Binaer = "0" + oktett4Binaer;
        }
        
        // Ergebnis ausgeben
        System.out.println();
        System.out.println("IP-Adresse (binaer):");
        System.out.println(oktett1Binaer + "." + oktett2Binaer + "." + oktett3Binaer + "." + oktett4Binaer);
    }
}