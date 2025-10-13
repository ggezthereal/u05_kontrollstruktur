// u5_kontrollstruktur
// Hochhaus

public class Hochhaus2 
{
    public static void main(String[] args) 
    {
        // Dach
        System.out.println("                                /\\");
        System.out.println("                               /  \\");
        System.out.println("                              /    \\");
        System.out.println("                             /      \\");
        System.out.println("                            /        \\");
        System.out.println("                           /   (  )   \\");
        System.out.println("                          /            \\");
        System.out.println("                         /______________\\");
        System.out.println("                        /|              |\\");

        // Wände und Fenster
        for (int i = 1; i < 4; i++) 
        {
            System.out.println("                         |  ___    ___  |");
            System.out.println("                         |  | |    | |  |");
            System.out.println("                         |  ---    ---  |");
        }

        System.out.println("                         | Hotel   ___  |");
        System.out.println("                         | |   |   | |  |");
        System.out.println("                         | |   |   ---  |");
        System.out.println("                        ==================");
        
     }
}
