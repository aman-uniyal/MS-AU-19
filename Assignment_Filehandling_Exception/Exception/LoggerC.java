import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.*; 

public class LoggerC {

	//private static final String GLOBAL_LOGGER_NAME = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
		int[] arr; 
        
	      // allocating memory for 5 integers. 
	      arr = new int[5]; 
	      
	      try
	      {
	      arr[1]=0;
	      arr[6]=0;//array index out of bound exception.
	      }
	      catch(ArrayIndexOutOfBoundsException e) {
	    	  log.log(Level.INFO, e.getMessage()); 
	    	 
	      }
	      
	      try
	      {
	      FileReader fr = new FileReader("inp.txt");//file not found exception.
	      }
	      
	      catch(FileNotFoundException e)
	      {
	    	  log.log(Level.SEVERE, e.getMessage()); 
	    	
	      }
	      
	      try
	      {
	      int x=5;
	      x=5/arr[1];//Arthemetic Exception.
	      }
	      
	      catch (ArithmeticException e)
	      {
	    	  log.log(Level.SEVERE, e.getMessage()); 
	      }

	}

}
