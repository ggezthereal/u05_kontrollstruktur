// u05_kontrollstruktur
// auf5.37

import java.io.*;

/**
 * Programm zur Berechnung aller Primzahlen bis zu einer bestimmten Obergrenze
 * 
 * Definition Primzahl:
 * Eine Primzahl ist eine ganze Zahl größer als 1, die nur durch 1 und 
 * sich selbst ohne Rest teilbar ist.
 * 
 * Beispiele: 2, 3, 5, 7, 11, 13, 17, 19, 23, ...
 */
public class Primzahl 
{
    
    public static void main(String[] args) throws Exception 
    {
        
        // Eingabeleser erstellen
        InputStreamReader eingabeLeser;
        BufferedReader pufferLeser;
        
        eingabeLeser = new InputStreamReader(System.in);
        pufferLeser = new BufferedReader(eingabeLeser);
        
        
        int obergrenze;        // Deklaration für die Obergrenze        
        int zahl;              // zu prüfende Zahl       
        int teiler;            // den Teiler beim Prüfen                                   
        boolean istPrimzahl;   // Deklaration um zu speichern, ob eine Zahl eine Primzahl ist
        
        // Obergrenze vom Anwender erfragen
        System.out.print("Bitte geben Sie die Obergrenze ein: ");
        String zeile = pufferLeser.readLine();
        obergrenze = Integer.parseInt(zeile);
        
        System.out.println();
        System.out.println("Primzahlen bis " + obergrenze + ":");
        System.out.println();
        
        // Alle Zahlen von 2 bis zur Obergrenze durchgehen
        // Die Zahl 1 ist keine Primzahl (laut Definition)
        // Deshalb beginnen wir bei 2
        zahl = 2;
        
        while (zahl <= obergrenze) 
        {
            
            // Prüfen, ob die aktuelle Zahl eine Primzahl ist
            // Zu Beginn nehmen wir an, dass die Zahl eine Primzahl ist
            istPrimzahl = true;
            
            // Wir testen alle möglichen Teiler von 2 bis (zahl - 1)
            // Wenn wir einen Teiler finden, bei dem die Division aufgeht,
            // dann ist die Zahl KEINE Primzahl
            teiler = 2;
            
            while (teiler < zahl) 
            {
                
                // Prüfen, ob die Zahl durch den aktuellen Teiler teilbar ist
                // Der Modulo-Operator % gibt den Rest einer Division zurück
                // Wenn der Rest 0 ist, dann geht die Division auf
                if (zahl % teiler == 0) 
                {
                    // Die Zahl ist durch teiler teilbar
                    // Also ist sie KEINE Primzahl
                    istPrimzahl = false;
                }
                
                // Nächsten Teiler prüfen
                teiler = teiler + 1;
            }
            
            // Wenn es eine Primzahl ist, ausgeben
            if (istPrimzahl == true) 
            {
                System.out.println(zahl);
            }
            
            //  Nächste Zahl prüfen
            zahl = zahl + 1;
        }
        
        System.out.println();
        System.out.println("Fertig!");
    }
}