/*
 * ArithmeticException : a built-in-class present in java.lang package. This exception occurs when an integer is divided by zero.
 * 
 * 
 */

public class ArithmeticExceptionDevideZero {

	public static void main(String[] args) {
		
		int num1, num2;
		
	     try { 
	        // Try block to handle code that may cause exception
	    	 num1=30; 
	    	 num2=0;	    	 
	         int output=num1/num2;
	         
	         System.out.println ("Result = " +output);
	        
	     } catch (ArithmeticException e) { 
	            // This block is to catch divide-by-zero error
	    	 System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
	       }
	     
	}

}
