/**
*David Lutelmowski
* 2/18/19
* Area Of Triangle Program
*/
package roundingerror;
import javax.swing.*;
import java.math.*;

public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num, squareR, square, numDiff;
        
        String input = JOptionPane.showInputDialog("Input A Number");
        
        num = Double.parseDouble(input);
        // This is the calculation to determine the square root and the round off error
        squareR = Math.sqrt(num);
        square = Math.pow(squareR, 2);
        numDiff = square - num;
        
        System.out.println("The square of the square root = " + square + "\n The round off error = " + numDiff);
        
                
        
        
      
        
      
    }
    
}
