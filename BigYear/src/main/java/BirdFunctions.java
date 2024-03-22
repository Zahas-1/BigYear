import java.util.Scanner;
import java.util.ArrayList;

public class BirdFunctions {
    // Declare an ArrayList to store Bird objects
    private static final ArrayList<Bird> birds = new ArrayList<>();

    // Method to add a new Bird object to the list
    public static void add(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    // Method to record observations for a bird
    public static void observation() {
        // Create a new Scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the name of the bird
        System.out.println("Bird?");

        // Read the name of the bird entered by the user
        String bird = scan.nextLine();

        // Prompt the user to enter the number of observations
        System.out.println("Observed no.?");

        // Check if the next input is an integer
        if (scan.hasNextInt()) {
            // Read the number of observations entered by the user
            int obs = Integer.parseInt(scan.nextLine());

            // Iterate over the list of birds
            for (Bird item : birds) {
                // Check if the name of the current bird matches the input name
                if (item.getName().equalsIgnoreCase(bird)) {
                    System.out.println("Bird updated");
                    // Set the number of observations for the bird
                    item.setObservation(obs);
                }
                else {
                    // Print a message if the input is not an integer
                    System.out.println("Bird not found!");
                }
            }
        }

    }

    // Method to print details of all birds in the list
    public static void all() {
        // Iterate over the list of birds
        for (Bird things : birds) {
            // Print details of each bird
            System.out.println(things);
        }
    }

    // Method to print details of a specific bird
    public static void one() {
        // Create a new Scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the name of the bird
        System.out.println("One Bird? ");

        // Read the name of the bird entered by the user
        String name = scan.nextLine();

        // Flag to track if the bird is found
        boolean found = false;

        // Iterate over the list of birds
        for (Bird items : birds) {
            // Check if the name of the current bird matches the input name
            if (items.getName().equalsIgnoreCase(name)) {
                // Print details of the bird
                System.out.println(items);
                // Set found to true if the bird is found
                found = true;
            }
        }

        // Print a message if the bird is not found
        if (!found) {
            System.out.println("Doesnt exist!");
        }

    }
}
