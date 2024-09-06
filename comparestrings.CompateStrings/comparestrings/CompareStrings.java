/*
 * Program: CompareStrings.java
 * Student: Lydia Frame 
 * Purpose: input two strings, first name and last name. 
 *          compare the size of both strings, output the size,
 *          then print out first name in all caps. 
*/
package comparestrings; 
import java.util.Scanner;

public class CompareStrings{
    public static void main(String[] args){
        // variables 
        Scanner input = new Scanner(System.in);
        String FirstName;
        String LastName; 

        //Inpute first and last name
        System.out.print("Enter your first name: ");
        FirstName = input.nextLine();
        System.out.print("Enter your last name: ");
        LastName = input.nextLine();

        //compare the size of both strings
        System.out.print("First and Last size difference: "); 
        System.out.println(FirstName.compareToIgnoreCase(LastName)); 

        //Display first name in all caps
        System.out.print("First name all caps: ");
        System.out.println(FirstName.toUpperCase());
    }
}