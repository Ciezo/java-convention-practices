/**
 * This class showcases the use of block comments in Java.
 * The methods in this class demonstrate the addition of two integers.
 * 
 * <p>
 * This class contains a method to add two numbers and a main method
 * to illustrate its usage.
 * </p>
 *
 * @author Cloyd Van Secuya
 * @date December 7, 2023
 */


/**
 * Using Block comments
 */
public class BlockComment {

    private static int num1;
    private static int num2;



    /**
     * Adds two numbers and returns the result.
     *
     * @param x the first number
     * @param y the second number
     * @return the sum of the two numbers
     */
    static int addTwoNumbers(int x, int y) {
        return x + y;
    }



    /**
     * Main method to demonstrate the {@link #addTwoNumbers(int, int)} method.
     *
     * @param args command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        num1 = 1;
        num2 = 3;

        int sum = addTwoNumbers(num1, num2);
        System.out.println("Answer: " + sum);
    }
}
