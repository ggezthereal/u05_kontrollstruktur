// u05_kontrollstrukturen
// auf5.25

public class Zahlungsplan2
{
   public static void main(String[] args)
   {
      int betrag = 475;
      int rate = 100;
      int ratenNummer = 1;

      System.out.println("Zahlungsplan 2");
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
