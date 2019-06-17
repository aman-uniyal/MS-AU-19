
public class Genericdemo<T> implements Comparable<Genericdemo> {

	String Rollno;
	T object;
	
	public String getName() {
		return Rollno;
	}
	public void setName(String Rollno) {
		this.Rollno = Rollno;
	}
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
	public int compareTo(Genericdemo  gc) {
		return this.Rollno.compareTo(gc.Rollno);
	}
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Genericdemo)  {
			Genericdemo ob = (Genericdemo)obj;
			if(this.Rollno.equals(ob.Rollno)) {
				return this.object.equals(ob.object);
			} else return false;
			
		} else {
			return false;
		}
	} 

	public static void main(String[] args)
	{
		
		//Demo String
		Genericdemo<String> gc1=new Genericdemo<>();
		Genericdemo<String> gc2=new Genericdemo<>();
		gc1.setName("MT17004");
		gc1.setObject("hello");
		gc2.setName("MT17003");
		gc2.setObject("hii");
		if(gc1.equals(gc2))
			System.out.println("String object Equal");
		
		else
			System.out.println("String object Not equal");
		//Demo Integer
		Genericdemo<Integer> gc3=new Genericdemo<>();
		Genericdemo<Integer> gc4=new Genericdemo<>();
		gc3.setName("MT17004");
		gc3.setObject(509000);
		gc4.setName("MT17004");
		gc4.setObject(509000);
		 
		if(gc3.equals(gc4))
			System.out.println("Integer object Equal");
		
		else
			System.out.println("Integer object Not equal");
		//Demo Float.
		Genericdemo<Float> gc5=new Genericdemo<>();
		Genericdemo<Float> gc6=new Genericdemo<>();
		gc5.setName("MT17004");
		gc5.setObject((float)509000.00);
		gc6.setName("MT17004");
		gc6.setObject((float)509000);
		 
		if(gc5.equals(gc6))
			System.out.println("Float object Equal");
		
		else
			System.out.println("Float object Not equal");
		
		
	}

}
