// u05_kontrollstrukturen
// auf5.22

public class Zahlungsplan
{
   public static void main(String[] args)
   {
      int betrag = 1200;
      int rate = betrag / 6;

      System.out.println("Zahlungsplan");
      System.out.println("============");

      for(int i = 1; i <= 6; i++)
      {
         System.out.println(i + ". Rate: " + rate + " Euro");
      }
   }
}
