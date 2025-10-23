// u05_kontrollstruktur
// auf5.38

import java.io.*;

/**
 * Programm zur Berechnung des Ergebnisses der Handelskammerprüfung
 * 
 * Die Prüfung besteht aus:
 * - AP1 (20% Gewichtung)
 * - AP2 mit 5 Teilen:
 *   - 3 schriftliche Prüfungen (je 10% Gewichtung)
 *   - Projekt-Dokumentation (25% Gewichtung)
 *   - Mündliche Prüfung (25% Gewichtung)
 * 
 * Bestanden wenn:
 * - Gesamtpunktzahl >= 50
 * - In AP2 kein Teil < 30 Punkte
 * - In AP2 höchstens ein Teil < 50 Punkte
 */
public class HandelskammerPruefung 
{
    
    public static void main(String[] args) throws Exception 
    {
        
        // Eingabeleser erstellen
        InputStreamReader eingabeLeser;
        BufferedReader pufferLeser;
        
        eingabeLeser = new InputStreamReader(System.in);
        pufferLeser = new BufferedReader(eingabeLeser);
        
        // Deklaration für die sechs Prüfungsteile
        int punkteAP1;
        int punkteAP2Schriftlich1;
        int punkteAP2Schriftlich2;
        int punkteAP2Schriftlich3;
        int punkteAP2Projekt;
        int punkteAP2Muendlich;
        
        // Deklaration für die Gesamtpunktzahl
        int gesamtpunkte;
        
        // Deklaration Hilfsvariable für die Eingabe
        String zeile;
        
        // Deklaration zum Prüfen der Bestehens-Bedingungen
        int anzahlUnter50;   // Zähler für Prüfungsteile in AP2 mit weniger als 50 Punkten
        boolean hatUnter30;  // Merker: Gibt es in AP2 einen Teil mit unter 30 Punkten?
        
        // Alle Punktzahlen abfragen
        
        System.out.print("Punkte AP1:                            ");
        zeile = pufferLeser.readLine();
        punkteAP1 = Integer.parseInt(zeile);
        
        System.out.print("Punkte AP2 schriftliche Pruefung 1:    ");
        zeile = pufferLeser.readLine();
        punkteAP2Schriftlich1 = Integer.parseInt(zeile);
        
        System.out.print("Punkte AP2 schriftliche Pruefung 2:    ");
        zeile = pufferLeser.readLine();
        punkteAP2Schriftlich2 = Integer.parseInt(zeile);
        
        System.out.print("Punkte AP2 schriftliche Pruefung 3:    ");
        zeile = pufferLeser.readLine();
        punkteAP2Schriftlich3 = Integer.parseInt(zeile);
        
        System.out.print("Punkte AP2 Projekt-Doku:               ");
        zeile = pufferLeser.readLine();
        punkteAP2Projekt = Integer.parseInt(zeile);
        
        System.out.print("Punkte AP2 Muendliche Pruefung:        ");
        zeile = pufferLeser.readLine();
        punkteAP2Muendlich = Integer.parseInt(zeile);
        
        // Gesamtpunktzahl berechnen
        // Gewichtung:
        // AP1: 20%
        // AP2 Schriftlich 1, 2, 3: je 10%
        // AP2 Projekt: 25%
        // AP2 Mündlich: 25%
        // Summe: 100%
        
        // Berechnung: (AP1*20 + Schr1*10 + Schr2*10 + Schr3*10 + Projekt*25 + Muendlich*25) / 100
        // Erst alles multiplizieren und addieren, dann ganz am Ende durch 100 teilen
        
        gesamtpunkte = punkteAP1 * 20 
                     + punkteAP2Schriftlich1 * 10 
                     + punkteAP2Schriftlich2 * 10 
                     + punkteAP2Schriftlich3 * 10 
                     + punkteAP2Projekt * 25 
                     + punkteAP2Muendlich * 25;
        
        // Durch 100 teilen für das Endergebnis mit kaufmännischer Aufrundung
        // Kaufmännische Rundung: 50 addieren, dann durch 100 teilen
        // Beispiel: 5250 + 50 = 5300, dann 5300 / 100 = 53
        // Beispiel: 5240 + 50 = 5290, dann 5290 / 100 = 52
        // Ab x,5 wird aufgerundet, unter x,5 wird abgerundet
        gesamtpunkte = (gesamtpunkte + 50) / 100;
        
        // Bestehens-Bedingungen prüfen        
        // Zähler initialisieren
        anzahlUnter50 = 0;
        hatUnter30 = false;
        
        // Bedingung 1: Gibt es in AP2 einen Teil mit unter 30 Punkten?
        if (punkteAP2Schriftlich1 < 30) 
        {
            hatUnter30 = true;
        }
        if (punkteAP2Schriftlich2 < 30) 
        {
            hatUnter30 = true;
        }
        if (punkteAP2Schriftlich3 < 30) 
        {
            hatUnter30 = true;
        }
        if (punkteAP2Projekt < 30) 
        {
            hatUnter30 = true;
        }
        if (punkteAP2Muendlich < 30) 
        {
            hatUnter30 = true;
        }
        
        // Bedingung 2: Wie viele Teile in AP2 haben unter 50 Punkte?
        if (punkteAP2Schriftlich1 < 50) 
        {
            anzahlUnter50 = anzahlUnter50 + 1;
        }
        if (punkteAP2Schriftlich2 < 50) 
        {
            anzahlUnter50 = anzahlUnter50 + 1;
        }
        if (punkteAP2Schriftlich3 < 50) 
        {
            anzahlUnter50 = anzahlUnter50 + 1;
        }
        if (punkteAP2Projekt < 50) 
        {
            anzahlUnter50 = anzahlUnter50 + 1;
        }
        if (punkteAP2Muendlich < 50) 
        {
            anzahlUnter50 = anzahlUnter50 + 1;
        }
        
        // Ergebnis ausgeben
        
        System.out.println();
        System.out.println("Gesamtpunkte: " + gesamtpunkte);
        
        // Prüfen, ob bestanden
        // Bestanden wenn ALLE drei Bedingungen erfüllt sind:
        // 1. Gesamtpunkte >= 50
        // 2. Kein Teil in AP2 mit unter 30 Punkten (hatUnter30 == false)
        // 3. Höchstens ein Teil in AP2 mit unter 50 Punkten (anzahlUnter50 <= 1)
        
        if (gesamtpunkte >= 50 && hatUnter30 == false && anzahlUnter50 <= 1) 
        {
            // Alle Bedingungen erfüllt
            System.out.println("Pruefung bestanden");
        } else 
          {
            // Mindestens eine Bedingung nicht erfüllt
            System.out.print("Pruefung nicht bestanden");
            
            // Grund für das Nichtbestehen angeben
            if (gesamtpunkte < 50) 
            {
                System.out.println(" weil Gesamtpunktzahl unter 50");
            } else if (hatUnter30 == true) 
              {
                System.out.println(" weil eine Punktzahl unter 30");
              } else if (anzahlUnter50 > 1) 
                {
                System.out.println(" weil mehr als ein Teil unter 50 Punkten");
                }
          }
    }
}