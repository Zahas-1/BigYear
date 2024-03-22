import java.util.Scanner;

public class BirdUI {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Print available commands
        System.out.println("==============");
        System.out.println("   COMMANDS   ");
        System.out.println("==============");
        System.out.println("Add - adds a new bird");
        System.out.println("Obs - adds number of observations");
        System.out.println("All - Prints all birds");
        System.out.println("One - prints only one user specified bird");
        System.out.println("Quit - ends the program");

        // Keep prompting for commands until the user decides to quit
        while (true) {
            System.out.print("Enter command: ");

            // Read the command entered by the user
            String command = scan.nextLine();

            // Process the command based on user input
            switch (command) {
                case "Add":
                    // Prompt user to enter details of the bird to be added
                    System.out.println("Enter name: ");
                    String name = scan.nextLine();
                    System.out.println("Enter Latin name: ");
                    String lName = scan.nextLine();
                    // Call the add method in BirdFunctions class to add the bird
                    BirdFunctions.add(name, lName);
                    break;
                case "Obs":
                    // Call the observation method in BirdFunctions class to record observations
                    BirdFunctions.observation();
                    break;
                case "All":
                    // Call the all method in BirdFunctions class to print details of all birds
                    BirdFunctions.all();
                    break;
                case "One":
                    // Call the one method in BirdFunctions class to print details of one specified bird
                    BirdFunctions.one();
                    break;
                case "Quit":
                    // Exit the program
                    return;
                default:
                    // Print error message for invalid command
                    System.out.println("Invalid command, try again");
            }
        }
    }
}
