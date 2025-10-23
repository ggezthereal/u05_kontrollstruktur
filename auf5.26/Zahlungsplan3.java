// u05_kontrollstrukturen
// auf5.26

import java.io.*;

public class Zahlungsplan3
{
   public static void main(String[] args) throws Exception
   {
      int betrag;
      int rate;
      int ratenNummer = 1;

      InputStreamReader eingabeLeser     = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser = new BufferedReader(eingabeLeser);
      String eingabe;

      System.out.println();
      System.out.println("Kredit (ganze Zahl): ");
      eingabe = gepufferterLeser.readLine();
      betrag  = Integer.parseInt(eingabe);

      System.out.println();
      System.out.println("Ratenhöhe (ganze Zahl): ");
      eingabe = gepufferterLeser.readLine();
      rate    = Integer.parseInt(eingabe);

      System.out.println("Zahlungsplan 3");
      System.out.println("==============");

      while(betrag > rate)
      {
         System.out.println(ratenNummer + ". Rate: " + rate + " Euro");

         betrag = betrag - rate;
         ratenNummer = ratenNummer + 1;
      }

      System.out.println(ratenNummer + ". Rate: " + betrag + " Euro");
   }
}
