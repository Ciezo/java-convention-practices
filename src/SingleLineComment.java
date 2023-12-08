/**
 * This class allows us to know how to when to use single line comments in Java.
 * 
 * <p>
 * This class has a method that asks user input then outputs it into the terminal.
 * I am going to use Scanner class for this because it's much easier 💀
 * </p>
 * 
 * @author Cloyd Van Secuya
 * @date December 7, 2023
 */



import java.util.Scanner;  



/**
 * Using single-line comments
 * <p>
 * Using single-line comments can allow us to quicly explain some snippets of code
 * following an indentation from a line. 
 * 
 * If a comment can't be written in a single-line it should follow a 
 * block format
 * 
 * Reference: https://www.oracle.com/java/technologies/javase/codeconventions-comments.html
 * </p>
 */
public class SingleLineComment {

    /* Use the Scanner class to fetch user input */
    private static String userInput; 
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Hello! Please enter what you want to say: ");
        System.out.print(">> ");   
        userInput = sc.nextLine(); 
        
        System.out.println("Output: " + userInput);
    }

}