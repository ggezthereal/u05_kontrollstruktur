// u05_kontrollstruktur
// auf5.31

public class Ratentilgung1
{
   public static void main(String[] args)
   {
      int kredit = 5000;
      int zinssatz = 6;
      int laufzeit = 5;
      int restschuld = kredit;

      System.out.println("Ratentilgung");
      System.out.println("");
      
      for(int i = 1; i <= laufzeit; i++)
      {
         int tilgungsbetrag = kredit / laufzeit;
         int zinsen = restschuld * zinssatz / 100;
         int zahlung = zinsen + tilgungsbetrag;

         System.out.println("Jahr: " + i + " Restschuld " + restschuld + " Zinsen " + zinsen + " Tilgung " + tilgungsbetrag + " Zahlung " + zahlung);
         restschuld = restschuld - tilgungsbetrag;
      }
   }
}
