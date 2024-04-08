import java.util.Scanner;

/**
 * This class checks whether a string consists only of digits.
 */
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = sc.nextLine(); // Read input from the user
        sc.close(); // Close the Scanner to prevent resource leak

        // Output "Yes" or "No" depending on the input string
        System.out.println(isAllDigits(s));
    }

    /**
     * Checks if a string consists only of digits.
     *
     * @param s The input string to be checked.
     * @return "Yes" if the string consists only of digits, "No" otherwise.
     */
    public static String isAllDigits(String s) {
        // Check if the string is empty
        if (s.isEmpty()) {
            return "No"; // If the string is empty, return "No"
        }

        // Iterate through each character of the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is not a digit
            if (!Character.isDigit(s.charAt(i))) {
                return "No"; // If not a digit, return "No"
            }
        }
        return "Yes"; // If all characters are digits, return "Yes"
    }
}
