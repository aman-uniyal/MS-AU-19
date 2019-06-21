
public class Calculator {
	Service s;
	
	public int add(int x,int y)
	{
	int e= s.provide_service();
	return x+y+e;
	}
	
	public int sub(int x,int y)
	{
		return x-y;
	}
	

}
