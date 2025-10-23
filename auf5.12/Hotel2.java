// u05_kontrollstruktur
// auf5.12

public class Hotel2
{
   public static void main(String[] args)
   {
      int sterne = 3;

      System.out.println("        /\\        ");
      System.out.println("       /  \\       ");
      System.out.println("      /    \\      ");
      System.out.println("     /      \\     ");
      System.out.println("    /        \\    ");
      System.out.println("   /   (  )   \\   ");
      System.out.println("  /            \\  ");
      System.out.println(" /______________\\ ");
      System.out.println("/|              |\\"); 

      System.out.println(" |  ___    ___  |");
      System.out.println(" |  | |    | |  |");
      System.out.println(" |  ---    ---  |"); 

      if(sterne == 1)
      {
         System.out.println(" |Absteige ___  |");
      }
      else
      {
         if(sterne == 2)
         {
            System.out.println(" |Gasthaus ___  |");
         }
         else
         {
            if(sterne == 3)
            {
               System.out.println(" |  Hotel  ___  |");
            }
            else
            {
               if(sterne == 4)
               {
                  System.out.println(" |  Palast ___  |");               
               }
               else
               {
                  System.out.println(" |  _____  ___  |");
               }      
            }
         }
      }

      System.out.println(" |  |   |  | |  |");
      System.out.println(" |  |   |  ---  |");
      System.out.println(" ================");
   }
}
