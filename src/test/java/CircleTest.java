import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTest {
	
	static Object area;
	double result;
	
	 Shape c =new Circle(2);
	 Shape c1 =new Circle(-2);
	 
	 
	 
	 public CircleTest(Object area, double result) {
		FactoryTest.area = area;
		this.result = result;
	 }
	 
	@Test
	public void Circle() {
		double area=c.getArea();
		Assert.assertEquals(result, area);
		
	}
	@Test
	public void Circletest() {
		double area=c1.getArea();
		Assert.assertEquals(result, area);
		
	}
	
	
	

}
