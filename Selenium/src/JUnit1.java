
import org.junit.Test;
import org.junit.*;

public class JUnit1 

{

	@Test
	public void abc()
	{
		System.out.println("I am Test Annotation");
	}
	
	@Before
		public void abc1()
		{
			System.out.println("Before Method");
		}
		
	@After
	public void abc2()
	{
		System.out.println("After Method");
	}	
	
}
