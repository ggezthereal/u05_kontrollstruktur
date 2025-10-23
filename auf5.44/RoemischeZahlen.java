// u05_kontrollstruktur
// auf5.44

import java.io.*;

public class RoemischeZahlen
{
   public static void main(String[] args) throws Exception
   {       
      String roemischeZahl;  // Deklaration, Variable für die Eingabe (römische Zahl)
      int arabischeZahl = 0; // Deklaration, Variable für das Ergebnis (arabische Zahl)
	   
      // Setup für die Eingabe vom Benutzer
      InputStreamReader eingabeLeser      = new InputStreamReader(System.in);
      BufferedReader gepufferterLeser     = new BufferedReader(eingabeLeser);

      // Benutzeraufforderung
      System.out.print("Roemische Zahl: ");
      roemischeZahl = gepufferterLeser.readLine();
      System.out.println();

      // Schleife durch jedes Zeichen der römischen Zahl
      for(int i = 0; i < roemischeZahl.length(); i++)
      { 
         // Aktuelles Zeichen im String
         char roemischChar = roemischeZahl.charAt(i);
         // Nächstes Zeichen, Standardwert = '0' (wenn keines vorhanden)
         char roemischCharNext = '0';

         // Prüfen, ob es ein nächstes Zeichen gibt (um Subtraktionsregel zu prüfen)
         if(i + 1 < roemischeZahl.length()) {
            roemischCharNext = roemischeZahl.charAt(i + 1);
       }

         // Subtraktionsregel: I, X, C können vor bestimmten größeren Zeichen stehen
         if(roemischChar == 'I') 
         {
            // I vor V oder X → abziehen
            if(roemischCharNext == 'V' || roemischCharNext == 'X') 
            {
               arabischeZahl = arabischeZahl - 1;
            } else 
              {
               arabischeZahl = arabischeZahl + 1;
              }
         }
         else if(roemischChar == 'V') 
         {
            arabischeZahl = arabischeZahl + 5; // V wird immer addiert
         }
         else if(roemischChar == 'X') 
         {
            // X vor L oder C → abziehen
            if(roemischCharNext == 'L' || roemischCharNext == 'C') 
            {
               arabischeZahl = arabischeZahl - 10;
            } else 
              {
               arabischeZahl = arabischeZahl + 10;
              }
         }
         else if(roemischChar == 'L') 
         {
            arabischeZahl = arabischeZahl + 50; // L wird immer addiert
         }
         else if(roemischChar == 'C') 
         {
            // C vor D oder M → abziehen
            if(roemischCharNext == 'D' || roemischCharNext == 'M') 
            {
               arabischeZahl = arabischeZahl - 100;
            } else 
              {
               arabischeZahl = arabischeZahl + 100;
              }
         }
         else if(roemischChar == 'D') 
         {
            arabischeZahl = arabischeZahl + 500; // D wird immer addiert
         }
         else if(roemischChar == 'M') 
         {
            arabischeZahl = arabischeZahl + 1000; // M wird immer addiert
         }
      }

      // Ergebnis ausgeben
      System.out.println("Arabische Zahl: " + arabischeZahl);
   }
}

