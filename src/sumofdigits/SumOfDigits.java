/*
 * Evan Robertson
 * SumOfDigits.java
 * April 14th 2020
 * This program takes a number 'n' and calculates the sum of all digits in 'n'
 * using recursive techniques
 */

package sumofdigits;
import javax.swing.*;
/**
 *
 * @author Evan
 */
public class SumOfDigits {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Get input as string
        String input = JOptionPane.showInputDialog("Enter a number to receive the sum of its digits");
        //Change to an integer
        int n = Integer.parseInt(input);
        //Use string variable to get the length of the number
        int digitAmount = input.length();
        //Call digits Method
        int output = digits(n, digitAmount);
        //Display output
        JOptionPane.showMessageDialog(null, "The sum of digits, " + n + ", is " + output + ".");
    }
    
    
    public static int digits(int num, int digitCount) {
        //Create a new variable to keep the original inputed number untouched
        int sum = 0;
        //Base case, when there are no more numbers remaing to be added
        if(digitCount == 0) {
            //Return the answer
            return sum;
        }
        //Recursive case
        else {
            //Get last digit
            sum = num%10;
            //Call digits method to go through each digit and add them together
            sum = sum + digits(num/10, digitCount-1);
            //Return the answer
            return sum;
        }
    }
    
}
