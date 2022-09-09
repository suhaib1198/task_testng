import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelogramTest {
	
	static Object area;
	double result;
	 Shape c =new Parallelogram(2,4);
	 Shape c1 =new Parallelogram(-2,4);
	 
	 
	 
	 public ParallelogramTest (Object area, double result) {
		FactoryTest.area = area;
		this.result = result;
	 }
	 
	@Test
	public void Parallelogram () {
		double area=c.getArea();
		Assert.assertEquals(result, area);
		
	}
	 
		@Test
		public void Parallelogramtest () {
			double area=c1.getArea();
			Assert.assertEquals(result, area);
			
		}
}
	
	