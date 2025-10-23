// u05_kontrollstruktur
// auf5.28

public class BreakEvenPoint2
{
   public static void main(String[] args)
   {
      int verkaufspreisst  = 1500;
      int rohstoffkostenst = 600;
      int arbeitskostenst  = 400;
      int fixkosten        = 5000;
      int breakeven        = -1;

      System.out.println();
      System.out.println("Break-Even-Point");
      System.out.println("================");
      System.out.println("Verkaufspreis pro Stueck:  " + verkaufspreisst);
      System.out.println("Rohstoffkosten pro Stueck: " + rohstoffkostenst);
      System.out.println("Arbeitskosten pro Stueck:  " + arbeitskostenst);
      System.out.println("Fixkosten pro Monat:       " + fixkosten);
      System.out.println("Maximale Stueckzahl pro Monat: " + "15");
      System.out.println();

      for(int i = 1; i <= 15; i++)
      {
         int stueckkosten     = fixkosten / i + rohstoffkostenst + arbeitskostenst;
         int ueberschuss      = verkaufspreisst - stueckkosten;

         System.out.println("Stueckzahl: " + i + " Stueckkosten: " + stueckkosten + 
                            " Ueberschuss pro Stueck: " + ueberschuss);
 
         if(ueberschuss < 0) 
         {
            breakeven = i + 1;
         }
      }   
         System.out.println();
         System.out.println("Es müssen mindestens " + breakeven + " Stueck produziert werden.");
   }
}   
