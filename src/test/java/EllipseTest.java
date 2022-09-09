import org.testng.Assert;
import org.testng.annotations.Test;

public class EllipseTest {
	static Object area;
	double result;
	
	 Shape e =new Ellipse(3,2);
	 Shape e1 =new Ellipse(-3,-2);
	 
	 
	 
	 public EllipseTest(Object area, double result) {
		FactoryTest.area = area;
		this.result = result;
	 }
	 
	@Test
	public void elipse() {
		double area=e.getArea();
		Assert.assertEquals(result, area);
		
	}
	@Test
	public void elipsetest() {
		double area=e1.getArea();
		Assert.assertEquals(result, area);
		
	}
}