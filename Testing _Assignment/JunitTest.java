import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JunitTest {

	Calculator cal;
	Service s;
	@Before
	public void Createcal()
	{
		this.cal=new Calculator();
		s=Mockito.mock(Service.class);
		System.out.println("before");
	}
	@Test
	public void Add()
	{
		
		Mockito.when(s.provide_service()).thenReturn(1);
		assertEquals(12, this.cal.add(5, 6));
		Mockito.verify(s.provide_service());
	}
	
	

}
