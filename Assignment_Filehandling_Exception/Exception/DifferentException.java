import java.io.FileNotFoundException;
import java.io.FileReader;

public class DifferentException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		int[] arr; 
        
	      // allocating memory for 5 integers. 
	      arr = new int[5]; 
	      
	      try
	      {
	      arr[1]=0;
	      arr[6]=0;//array index out of bound exception.
	      }
	      catch(ArrayIndexOutOfBoundsException e) {
	    	  System.out.println("Array Index out of bound!!!!");
	    	  System.out.println("The index you have entered is invalid");
	          System.out.println();
	      }
	      
	      try
	      {
	      FileReader fr = new FileReader("inp.txt");//file not found exception.
	      }
	      
	      catch(FileNotFoundException e)
	      {
	    	  System.out.println("File Not Found!!!");
	    	  System.out.println();
	      }
	      
	      try
	      {
	      int x=5;
	      x=5/arr[1];//Arthemetic Exception.
	      }
	      
	      catch (ArithmeticException e)
	      {
	    	  System.out.println("Arthmetic Exception");
	      }
	}

}
