package vendingmachine;

import java.util.Scanner;
/**
 * @author Imran Aziz 03/10/17 
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        init(); 
        selected(); 
        enjoy(); 
        
    }
    
    public static void init() { //Announces vending machine selections and asks for selection
        
        System.out.println("What's cookin'?");
        System.out.println("1.Coffee" + " 2.Tea" + " 3.HotChoc" + " 4.Miso");
        
    }
    
    public static void selected() { //Takes input and uses if statements to determine output
        
        System.out.println("Enter number to continue");
        Scanner scan = new Scanner(System.in);
        String select = scan.nextLine();
        if (select.equals("1"))
        {
            System.out.println("Enjoy your Coffee! That'll be 5.00");
        }   
        else if (select.equals("2"))
        {
            System.out.println("Enjoy your Tea! That's 1.75");
        }
        else if (select.equals("3"))
        {
            System.out.println("Enjoy your HotChoc! That'll be 2.50");
        }
        else if (select.equals("4"))
        {
            System.out.println("Pfft, hipster. That's 3.75");
        }
        else
        {
            System.out.println("Sorry, we don't serve that");
        }
           
    }
    
    public static void enjoy() { //Goodbye message, closes program
        System.out.println("Have a great day!");
    }
    
}
