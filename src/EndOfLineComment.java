/**
 * This class can help us how to use end-of-line comments
 * 
 * This class showcases how we can convert String to char array.
 * Char arrays can be helpful when we are trying to segment each value in a certain block assigned in memory.
 * 
 * <p>
 * This class contains a method that converts String to char array, then another method which assigns 
 * the converted char array to another char again from the last element LOL, because why not?
 * </p>
 *
 * @author Cloyd Van Secuya
 * @date December 7, 2023
 */



 /**
  * Using End of Line comments
  */
public class EndOfLineComment {
    
    private static String myString;         // Assign here the string you want 
    private static char myCharArr;          // Assigned here is the last char element or value 



    /**
     * 
     * @param x String here of course!
     * @return converted char array from String
     */
    static char[] convertStrToCharrArr(String x) {
        char[] temp = x.toCharArray();
        return temp;
    }



    /**
     * 
     * @param z assign the last char array 
     * @return the last element of the char array
     */
    static char assignCharArryToCharOnly(char[] z) {
        char dump = '\0';
        dump = z[z.length - 1];
        return dump;
    }



    /**
     *  Main method to demonstrate the following:  
     * 
     * {@link #convertStrToCharrArr(String)} method.
     * {@link #assignCharArryToCharOnly(char[])} method.
     * @param args command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        myString = "Hello, World";
        char[] converted = convertStrToCharrArr(myString);

        System.out.println("Printing converted string to char array....");
        for(int i = 0; i < converted.length; i++) {
            System.out.println(converted[i] + "\n");
        }

        System.out.println("Converting charr array and assigning to char only");
        
        myCharArr = assignCharArryToCharOnly(converted);
        
        System.out.println("Results: " + myCharArr);
        
    }
}