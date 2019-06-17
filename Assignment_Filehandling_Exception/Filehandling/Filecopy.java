import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filecopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			 
			try {
				FileReader fr = new FileReader("inp.txt");
				FileWriter fw = new FileWriter("out.txt", true);
				BufferedReader br = new BufferedReader(fr);
				
				String s;
	 
				while ((s = br.readLine()) != null) { 
					fw.write(s); 
					fw.flush();
				}
				br.close();
				fw.close();
	            
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
