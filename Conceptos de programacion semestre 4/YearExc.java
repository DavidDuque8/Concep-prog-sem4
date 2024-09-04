import java.util.Scanner;

public class YearExc {
    public static void main(String[] args) {
        // Call the scanner library to receive information from the user
        Scanner scanner = new Scanner(System.in);

        // Request the user to enter the document number
        System.out.print("Please enter your document number (11 digits) ");
        String document = scanner.nextLine();

        // Confirm the number entered is 11 digits long
        if (document.length() == 11) {
            
            // Extract the first two digits which represents the year
            String year = document.substring(0, 2);

            // Convert the extracted string to an integer
            int yearOfBirth = Integer.parseInt(year);

            // Show the year obtained
            System.out.println("The year of birth is: " + yearOfBirth);
        } else {
            // Error message if the document number is not 11 digits long
            System.out.println("The document number must be 11 digits long");
        }

        // Close the scanner
        scanner.close();
    }
}
