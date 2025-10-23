// u05_kontrollstruktur
// auf5.30

import java.io.*;

public class BreakEvenPointZusatz
{
   public static void main(String[] args) throws Exception
   {
      int breakeven = 0;

      InputStreamReader   eingabeLeser;
      BufferedReader      gepufferterLeser;
      String              eingabeText = "";

      eingabeLeser      = new InputStreamReader(System.in);
      gepufferterLeser  = new BufferedReader(eingabeLeser);

      System.out.println("Bitte Verkaufspreis pro Stueck eingeben: ");
      eingabeText = gepufferterLeser.readLine();
      int verkaufspreis = Integer.parseInt(eingabeText); 

      System.out.println("Bitte Rohstoffkosten pro Stueck eingeben: ");
      eingabeText = gepufferterLeser.readLine();
      int rohstoffkosten = Integer.parseInt(eingabeText);

      System.out.println("Bitte Arbeitskosten pro Stueck eingeben: ");
      eingabeText = gepufferterLeser.readLine();
      int arbeitskosten = Integer.parseInt(eingabeText);

      System.out.println("Bitte Fixkosten pro Stueck eingeben: ");
      eingabeText = gepufferterLeser.readLine();
      int fixkosten = Integer.parseInt(eingabeText);

      System.out.println("Bitte Maximale Stueckzahl pro Monat eingeben: ");
      eingabeText = gepufferterLeser.readLine();
      int stueckzahl = Integer.parseInt(eingabeText);

      System.out.println("Break-Even-Point");
      System.out.println("================");
      System.out.println("Verkaufspreis pro Stueck:      " + verkaufspreis);
      System.out.println("Rohstoffkosten pro Stueck:     " + rohstoffkosten);
      System.out.println("Arbeitskosten pro Stueck:      " + arbeitskosten);
      System.out.println("Fixkosten pro Monat:           " + fixkosten);
      System.out.println("Maximale Stueckzahl pro Monat: " + stueckzahl);
      System.out.println(" ");

      for(int i = 1; i<= stueckzahl; i++)
      {
          int variablekosten = (rohstoffkosten + arbeitskosten) * i;
          int erloes = verkaufspreis * i;
          int gesamtkosten = variablekosten + fixkosten;
          int ueberschuss = erloes - gesamtkosten;
          int stueck = rohstoffkosten + arbeitskosten;

          int stueckkosten = fixkosten / i + stueck;
          int stueckueberschuss = verkaufspreis - stueckkosten;
         
          System.out.println("Stueckzahl: " + i + " " + "Stueckkosten: " + stueckkosten + " " + "Ueberschuss pro Stueck: " + stueckueberschuss);
         
          if(stueckueberschuss < 0)
          {
            breakeven = i + 1;
          }
      } 

      System.out.println("Es müssen mindestens " + breakeven + " Stueck produziert werden.");   
   }
}
