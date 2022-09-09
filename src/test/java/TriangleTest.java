import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {
	static Object area;
	double result;
	 Shape c =new Triangle(4,4);
	 Shape c1 =new Triangle(8,4);
	 
	 
	 
	 public TriangleTest (Object area, double result) {
		FactoryTest.area = area;
		this.result = result;
	 }
	 
	@Test
	public void Triangle() {
		double area=c.getArea();
		Assert.assertEquals(result, area);
		
	}
	@Test
	public void Triangletest() {
		double area=c1.getArea();
		Assert.assertEquals(result, area);
		
	}
}