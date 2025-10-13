// u05_kontrollstruktur
// auf5.04

public class Erfolg
{
   public static void main(String[] args)
   {
     int a;
     a = 3;

     System.out.println("Regeln fuer den Erfolg:");
     System.out.println();

     for(int i = 1; i <= a; i++)
     {
       System.out.print("Regel " + i + ": ");
       System.out.println("Ueben!");
     }
   }
}
