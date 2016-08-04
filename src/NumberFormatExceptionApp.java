/*
 * NumberFormatException : built-in class gets created whenever a string is parsed to any numeric variable.
 * parseInt : method parses the string argument s as a signed decimal integer (convert String to int).
 *   - It is generally used if we have to perform mathematical operations on the string that contains number. 
 *   - Whenever we get data from textfield or textarea, entered data is received as a string. If entered data is integer, we need to convert string to int.
 * 
 */
public class NumberFormatExceptionApp {

	public static void main(String[] args) {
		
		String userInput = "911"; //replace with XYZ to trigger catch()
		System.out.println("userInput Class before parse : " + userInput.getClass());
		
		String randomDouble = "5";
		System.out.println("randomDouble Class before parse : " + randomDouble.getClass());
		
		String anotherInput = "765";
		System.out.println("anotherInput Class before parse : " + anotherInput.getClass());
		
		try{
			 int num=Integer.parseInt ("666") ;
			 double d = Double.parseDouble(randomDouble);
			 int userInputProcess=Integer.parseInt (userInput) ;
			 
			 System.out.println("ParseInt : " + num);
			 System.out.println("ParseInt : " + userInputProcess);
			 System.out.println("ParseDouble : " + d);
			 
			 double userOutput = userInputProcess * d;
			 System.out.println("userOutput : " + userOutput);
			 
			 //try to implement methamatical operation. uncomment and we will get an error saying that we can't perform *
			 //double userOutput = anotherInput * d;
			 //System.out.println("userOutput : " + userOutput);
			 
		 }catch(NumberFormatException e){
			 System.out.println("Number format exception occurred");
		 }

	}

}
