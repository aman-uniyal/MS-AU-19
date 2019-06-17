import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filecopyanotherdir {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			 
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the file name");
				String filename=sc.nextLine();
				System.out.println("enter the valid path where you want to copy the file");
				String Path=sc.nextLine();
				FileReader fr = new FileReader("filename");
				FileWriter fw = new FileWriter("", true);
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
