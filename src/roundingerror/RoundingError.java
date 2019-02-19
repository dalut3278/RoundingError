/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundingerror;
import javax.swing.*;
import java.math.*;

/**
 *David Lutelmowski
 * 2/18/19
 * Rounding Error Program
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num, squareR, square, numDiff;
        
        String input = JOptionPane.showInputDialog("Input A Number");
        
        num = Double.parseDouble(input);
        
        squareR = Math.sqrt(num);
        square = Math.pow(squareR, 2);
        numDiff = square - num;
        
        // JOptionPane.showMessageDialog(null, square );
        System.out.println("The square of the square root = " + square + "\n The round off error = " + numDiff);
        
                
        
        
      
        
      
    }
    
}
