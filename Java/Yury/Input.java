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
            
            System.out.print("Enter month's number: ");

            
            int monthNumber;

            monthNumber = scanner.nextInt();

            switch (monthNumber) {

            case 1:

                  System.out.println("January");

                  break;

            case 2:

                  System.out.println("February");

                  break;

            case 3:

                  System.out.println("March");

                  break;

            case 4:

                  System.out.println("April");

                  break;

            case 5:

                  System.out.println("May");

                  break;

            case 6:

                  System.out.println("June");

                  break;

            case 7:

                  System.out.println("July");

                  break;

            case 8:

                  System.out.println("August");

                  break;

            case 9:

                  System.out.println("September");

                  break;

            case 10:

                  System.out.println("October");

                  break;

            case 11:

                  System.out.println("November");

                  break;

            case 12:

                  System.out.println("December");

                  break;

            default:

                  System.out.println("Invalid month.");

                  break;

            }
        } // end main method
        

        
    } // end MyConsoleIO class