import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vertical_bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String inp_str = sc.nextLine();//Taking string as input from console
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>(); //Initializing hashmap. 
		for(int i=0;i<inp_str.length();i++) { 
			char ch = Character.toLowerCase(inp_str.charAt(i));
            if (hm.containsKey(ch)&&Character.isLetter(ch)) { 
  
                // If char is present in HashMap and its a English alphabet,increment its count.
                hm.put(ch, hm.get(ch) + 1); 
            }
            else if(Character.isLetter(ch))
            {
            	// If char is a English alphabet
            	
            	hm.put(ch, 1); 
            }
		}
		
		  for (Map.Entry entry : hm.entrySet()) { 
			    
			    int i = (Integer) entry.getValue();
			    System.out.print(entry.getKey());
			    for (int j=0;j<i;j++)
	            System.out.print("#");
			    System.out.println();
	        } 
	}

}
