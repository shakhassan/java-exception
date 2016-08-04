/*
 * ArrayIndexOutOfBounds  : a built in class present in java.lang package. This exception occurs when the referenced element does not exist in the array.
 * 
 */
public class ArrayIndexOutOfBoundsApp {

	public static void main(String[] args) {
		
		try{
	        int a[]=new int[5];
	        //Array has only 5 elements
	        a[0]=10;//initialization  
	        a[1]=20;  
	        a[2]=70;  
	        a[3]=40;  
	        a[4]=50; 
	        
	        a[5] = 9;
	        
	        //printing array  
	        for(int i=0;i<a.length;i++)
	        	System.out.println("Index " + i + ": " + a[i]);  
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println ("You've assigned a value to a non-exist array");
	      }

	}

}
