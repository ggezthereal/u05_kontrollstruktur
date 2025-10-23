// u05_kontrollstruktur
// auf5.32


import java.io.*;

public class Ratentilgung2
{
   public static void main(String[] args) throws Exception
   {
      int kredit;
      int zinssatz;
      int laufzeit;

      InputStreamReader eingabeLeser     = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser = new BufferedReader(eingabeLeser);
      String eingabe;

      System.out.println();
      System.out.println("Kreditbetrag (ganze Zahl): ");
      eingabe = gepufferterLeser.readLine();
      kredit  = Integer.parseInt(eingabe);

      System.out.println();
      System.out.println("Zinssatz (ganze Zahl): ");
      eingabe  = gepufferterLeser.readLine();
      zinssatz = Integer.parseInt(eingabe);

      System.out.println();
      System.out.println("Laufzeit (ganze Zahl): ");
      eingabe  = gepufferterLeser.readLine();
      laufzeit = Integer.parseInt(eingabe);

      int tilgung    = kredit / laufzeit;
      int restschuld = kredit;

      System.out.println("Ratentilgung");
      System.out.println();

      for(int jahr = 1; jahr <= laufzeit; jahr++)
      {
         int zinsen     = restschuld / 100 * zinssatz; 
         int zahlung    = tilgung + zinsen;

         System.out.println("Jahr " + jahr + "   Restschuld " + restschuld + "   Zinsen "
                         + zinsen + "   Tilgung " + tilgung + "   Zahlung " + zahlung);
         restschuld -= tilgung;
      }
   }
}
