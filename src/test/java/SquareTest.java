import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

	static Object area;
	double result;
	 Shape c =new Square(4,4);
	 Shape c1 =new Square(3,4);
	 
	 
	 
	 public SquareTest (Object area, double result) {
		FactoryTest.area = area;
		this.result = result;
	 }
	 
	@Test
	public void Square() {
		double area=c.getArea();
		Assert.assertEquals(result, area);
		
	}
	@Test
	public void Squaretest() {
		double area=c1.getArea();
		Assert.assertEquals(result, area);
		
	}
}