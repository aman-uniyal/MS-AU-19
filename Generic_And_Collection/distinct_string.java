import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class distinct_string {
	
	
	
	
	
	  public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
	    { 
	        // Create a list from elements of HashMap 
	        List<Map.Entry<String, Integer> > list = 
	               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
	  
	        // Sort the list 
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
	            public int compare(Map.Entry<String, Integer> o1,  
	                               Map.Entry<String, Integer> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        }); 
	          
	        // put data from sorted list to hashmap  
	        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
	        for (Map.Entry<String, Integer> aa : list) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        return temp; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"abc","abc","abc","xyz","pqr","pqr"};
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(int i=0;i<input.length;i++) {
			
			
			if (hm.containsKey(input[i])) {
				 hm.put(input[i], hm.get(input[i]) + 1); 
			}
			
			else
			{
				
				hm.put(input[i], 1); 
			}
			
		}
		Map<String, Integer> hm2 = sortByValue(hm);
		
		for (Map.Entry entry : hm2.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        }
		

	}

}
