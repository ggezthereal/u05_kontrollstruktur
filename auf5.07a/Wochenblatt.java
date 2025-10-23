// u05_kontrollstruktur
// auf5.07a

public class Wochenblatt
{
   public static void main(String[] args)
   {
      System.out.println();
      System.out.println("Zustellung Wochenblatt");
      System.out.println();

      for(int nummer = 5; nummer <=7; nummer++)
      {
         System.out.println("Ich betrete Nr " + nummer);

         for(int stock = 0; stock <= 3; stock++)
         {
            System.out.println("Zugestellt in Nr " + nummer + ", " + stock + ".Stock");
         }
         
         System.out.println();
      }
   }
}
