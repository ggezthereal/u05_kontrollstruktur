// u05_kontrollstruktur
// auf 5.14

public class ABCAnalyse
{
   public static void main(String[] args)
   {
      char prioritaet = 'A';

      if(prioritaet == 'A')
      {
         System.out.println("hoch");
      }
      if(prioritaet == 'B')
      {
         System.out.println("mittel");         
      }
      if(prioritaet == 'C')
      {
         System.out.println("niedrig");
      }
      else
      {
         System.out.println("unzulaessiger Wert");
      }
   }
}
