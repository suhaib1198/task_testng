import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TrapezoidTest {

	static Object area;
	double result;
	 Shape c =new Trapezoid(4,6,2);
	 Shape c1 =new Trapezoid(6,6,2);
	 
	 
	 
	 public TrapezoidTest (Object area, double result) {
		FactoryTest.area = area;
		this.result = result;
	 }
	 
	@Test
	public void Trapezoid() {
		double area=c.getArea();
		Assert.assertEquals(result, area);
		
	}
	@Test
	public void Trapezoidtest() {
		double area=c1.getArea();
		Assert.assertEquals(result, area);
		
	}
}