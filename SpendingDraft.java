import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Scanner;

public class SpendingDraft {
    
    public static void main(String[] args) {
        
        // define the player options and their net worths
        String[] options = {"1) Tom Brady", "2) George Clooney", "3) Ralph Lauren"};
        int[] netWorths = {100_000_000, 500_000_000, 1_000_000_000};
        
        // print the options to the player
        System.out.println("Choose one of the following player options 1,2,or 3:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        
        // get the player's choice
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        // validate the player's choice
        if (choice < 1 || choice > options.length) {
            System.out.println("Invalid choice. Please try again.");
            return;
        }
        
        // print the player's choice and net worth
        String chosenOption = options[choice - 1];
        int chosenNetWorth = netWorths[choice - 1];
        System.out.println("You have chosen " + chosenOption + " with a net worth of " + chosenNetWorth + ".");
        
        Category.Map();


        while (true){
            int itemPrice = Category.ChooseItem(options);
            if (itemPrice > chosenNetWorth) {
                System.out.println("You cannot afford this item. Please select another item.");
            
            }
            
            if (itemPrice < chosenNetWorth){
                chosenNetWorth = chosenNetWorth -  itemPrice;
                System.out.println("You have " + (chosenNetWorth) + " remaining");
            }
            if (chosenNetWorth < 0) {
                System.out.println("Good Game. Come Back Soon.");
                System.exit(0);
        }
    }
}
}





