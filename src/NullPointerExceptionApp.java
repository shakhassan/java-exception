/*
 * NullPointerException : An object of this class gets created whenever a member is invoked with a “null” object.
 */
public class NullPointerExceptionApp {

	public static void main(String[] args) {
		
		try{
			//String str=null;
			String str = "hello";
			System.out.println (str.length());
			
		}catch(NullPointerException e){
			System.out.println("NullPointerException..");
		}

	}

}
