import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {

	static Object area;
	double result;
	 Shape c =new Rectangle(2,4);
	 Shape c1 =new Rectangle(2,-4);
	 
	 
	 
	 public RectangleTest (Object area, double result) {
		FactoryTest.area = area;
		this.result = result;
	 }
	 
	@Test
	public void Rectangle() {
		double area=c.getArea();
		Assert.assertEquals(result, area);
		
	}
	@Test
	public void Rectangletest() {
		double area=c1.getArea();
		Assert.assertEquals(result, area);
		
	}
}
	
	