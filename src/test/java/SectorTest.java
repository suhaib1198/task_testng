import org.testng.Assert;
import org.testng.annotations.Test;

public class SectorTest {

	static Object area;
	double result;
	 Shape c =new Sector(2,4);
	 Shape c1 =new Sector(0,4);
	 
	 
	 
	 public SectorTest (Object area, double result) {
		FactoryTest.area = area;
		this.result = result;
	 }
	 
	@Test
	public void Sector() {
		double area=c.getArea();
		Assert.assertEquals(result, area);
		
	}
	@Test
	public void Sectortest() {
		double area=c1.getArea();
		Assert.assertEquals(result, area);
		
	}
}
	