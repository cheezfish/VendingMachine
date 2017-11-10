package vendingmachine;

import java.util.Scanner;
/**
 * @author Imran Aziz 03/10/17 
 */
public class VendingMachine 
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        
        int a = input(); 
        selected(a); 
        enjoy(); 
        System.exit(0);
        
    }
    
    public static int input()
    {
        System.out.println("What's cookin'?");
        System.out.println("1. Coffee" + " 2. Tea" + " 3. HotChoc" + " 4. Miso");
        System.out.println("Enter number to continue");
        Scanner scan = new Scanner(System.in);
        int select = scan.nextInt();
        return select;
    }
    
    public static void selected(int a) { //Takes input and uses if statements to determine output
        
        if (a == 1)
        {
            System.out.println("Enjoy your Coffee! That'll be 5.00");
        }   
        if (a == 2)
        {
            System.out.println("Enjoy your Tea! That's 1.75");
        }
        if (a == 3)
        {
            System.out.println("Enjoy your HotChoc! That'll be 2.50");
        }
        if (a == 4)
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
