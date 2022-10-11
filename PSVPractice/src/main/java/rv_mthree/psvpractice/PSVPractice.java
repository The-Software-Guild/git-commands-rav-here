

package rv_mthree.psvpractice;

/**
 *
 * @author rachelvickerman
 */
public class PSVPractice {
    
    public static void main(String[] args) {
        // Declare variables to use in the examples
        int result;
        int op1;
        int op2;
        int op3;
        
        //
        // Assignment
        //
        // Initialize result with the value of 0
        result = 0; // assign the value 0 to the variable result

        // Initialize the operands
        op1 = 5;
        op2 = 7;

        // Assignment works with variable values too
        op3 = op2; // now both are value 7
                
        // Addition
        //
        // binary infix operator
        // with literals 
        result = 42 + 53;  

        // with variables
        result = op1 + op2; 

        // combination 
        result = 1 + op1;  // result now equals 6

        // chain
        result = 1 + op1 + op2 + op3;

        // adding to initial values 
        result = 2;  // set result to 2
        result += 4;  // result = result + 4 = 6
        result += op1; // result = result + operand1 = 11

        
        // Subtraction
        //
        // binary infix operator
        // with literals
        result = 9 - 5;  

        // variables
        result = op1 - op2;  

        // combination
        result = 15 - op1;  

        // chain 
        result = 19 - op1 - op2 - op3;

        // subtracting from intial values
        result = 2;  // set result to 2
        result -= 4;  // result = result - 4 = -2
        result -= op1; // result = result - operand1 = -2 -5 = -7

        
        // Multiplication
        //
        // binary infix operator
        // literals
        result = 2 * 3;  

        // variables
        result = op1 * op2;  

        // combination
        result = 2 * op1;  

        // chain 
        result = 2 * op1 * op2 * op3;

        // Multiplying initial values
        result = 2;  // set result to 2
        result *= 4;  // result = result * 4 = 8
        result *= op1; // result = result * 5 = 40

        
        // Division and Modulus
        //
        // binary infix operator
        // literals
        result = 6 / 3;  

        // variables
        result = op1 / op2;      
        System.out.println(result);
        // only get whole number part of divison
        // 7 does not go into 5 in terms of whole numbers result = 0
      
        // modulus operator gives remainder
        result = op1 % op2;  // 7 goes into 5 0 times with remainder 5
        System.out.println(result);
        
        // with a combination 
        result = 20 / op1;  

        // chain divisions
        result = 245 / op1 / op2 / op3;

        // dividing initial values
        result = 40;  // set result to 40
        result /= 4;  // result = result/4 = 10
        result /= op1; // result = result/operand1 = 2
    }

    
}
