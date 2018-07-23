import java.util.Scanner;  // needed for Scanner

    /** A Java program that demonstrates console based input and output. */
    public class Input 
    {
        // Create a single shared Scanner for keyboard input
        private static Scanner scanner = new Scanner( System.in );

        // Program execution starts here
        public static void main ( String [] args )
        {
            // Prompt the user
            System.out.print( "Type some data for the program: " );

            Scanner scanner = new Scanner( System.in );
            // Read a line of text from the user.
            String input = scanner.nextLine();
            int input2 = scanner.nextInt();
            
            // Display the input back to the user.
            System.out.println( "input = " + input );

        } // end main method

    } // end MyConsoleIO class