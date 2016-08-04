/*
 * StringIndexOutOfBound : An object of this class gets created whenever an index is invoked of a string, which is not in the range.
 */
public class StringIndexOutOfBoundApp {

	public static void main(String[] args) {
		
		try{
			 String str="helloworld";
			 System.out.println("Length for str : " + str.length());;
			 
			 char c = str.charAt(0);
			 c = str.charAt(40);
			 
			 System.out.println(c);
			 
		 }catch(StringIndexOutOfBoundsException e){
			  System.out.println("StringIndexOutOfBoundsException!!");
		 }

	}

}
