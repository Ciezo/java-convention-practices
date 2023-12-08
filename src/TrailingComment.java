/**
 * This class allows us to see how to use Trailing comment
 * 
 * <p>
 * For this I am going to use methods which take two Strings and compare them with each other
 * by using another method to convert them into char arrays
 * </p>
 * 
 * 
 * @author Cloyd van Secuya
 * @date December 7, 2023
 */



import java.util.Scanner;  



/**
 * Using Trailing comments
 * <p>
 * This format is used for describing a section, line, or portion of a code. 
 * It is important to remember that indention of this comment format should follow consistently.
 * 
 * Reference: https://www.oracle.com/java/technologies/javase/codeconventions-comments.html
 */
public class TrailingComment {

    /* Use the Scanner class to fetch user input for two Strings */
    private static String str1; 
    private static String str2; 
    private static Scanner sc = new Scanner(System.in);

    /* Using the char arrays to compare the two string for a char-per-char basis */
    private static char[] comp1;        /* Str1 will be assigned here */
    private static char[] comp2;        /* Str2 will be assigned here */

    static int counter = 0;



    // I reused the old method from the BlockComment.java
    // I am trying to use this for conversion reasons again LOL
    static char[] convertStrToCharrArr(String x) {
        char[] temp = x.toCharArray();
        return temp;
    }



    /**
     * @param char arrays to be compared against each other
     * @return true if there is any differences based on a char-per-char basis.
     * Otherwise it will return false
     */
    static boolean checkIfAnyDifferences(char[] x, char[] y) {
        
        // Use x as a basis
        for(int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) {
                counter++;          /* Continue the iterator to loop if there is no matches on our chars */
                System.out.println("Char values are different at....");
                System.out.println("Char 1: " + x[i] + "\t \t " + " at index: " + i);
                System.out.println("Char 2: " + y[i] + "\t \t " + " at index: " + i);
                
                return true;
            } else {
                System.out.println("Two chars are equal values at....");
                System.out.println("Char 1: " + x[i] + "\t \t " + " at index: " + i);
                System.out.println("Char 2: " + y[i] + "\t \t " + " at index: " + i);
            }
            
        } return false;        
    }



    public static void main(String[] args) {
        System.out.print("Enter string 1: ");
        str1 = sc.nextLine();
        
        System.out.print("Enter string 2: ");
        str2 = sc.nextLine();

        System.out.print("Converting Strings to char array....");
        comp1 = convertStrToCharrArr(str1);
        comp2 = convertStrToCharrArr(str2);

        System.out.println("Printing comp1 char[]");
        for(int i = 0; i < comp1.length; i++) {
            System.out.println(comp1[i]);
        }

        System.out.println("Printing comp2 char[]");
        for(int j = 0; j < comp2.length; j++) {
            System.out.println(comp2[j]);
        }

        System.out.println("Beginning Comparison....");
        boolean chk = checkIfAnyDifferences(comp1, comp2);
        System.out.println("Are there any differences between the two chars?  " + chk);

    }

}