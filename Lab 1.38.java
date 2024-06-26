import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;
        char userChar = ' ';
        String userString = "";

        System.out.println("Enter integer: ");
        userInt = scnr.nextInt();

        // Read other items into variables
        System.out.println("Enter double: ");
        userDouble = scnr.nextDouble();

        System.out.println("Enter character: ");
        userChar = scnr.next().charAt(0);

        System.out.println("Enter string: ");
        userString = scnr.next();

        // Output the four values on a single line separated by a space
        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);

        // Output the four values in reverse
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);

        // Cast the double to an integer, and output that integer
        int castedInt = (int) userDouble;
        System.out.println(userDouble + " cast to an integer is " + castedInt);
        
        return;
    }
}