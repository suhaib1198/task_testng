
import org.testng.annotations.Factory;


public class FactoryTest {
	static Object area;
	static double result;
	 
	public FactoryTest(Object area, double result) {
		FactoryTest.area = area;
		FactoryTest.result = result;
		
	}
	
	
	
	@Factory
	public static Object[] factory() {
		
		
		FactoryTest s=new FactoryTest(area,result);
		CircleTest ct =new CircleTest(area,12.566370614359172);
		EllipseTest et=new EllipseTest(area, 18.84955592153876);
		ParallelogramTest pt=new ParallelogramTest(area, 8);
		RectangleTest rt=new RectangleTest(area, 8);
		SectorTest st=new SectorTest(area, 8);
		SquareTest sqt=new SquareTest(area, 16);
		TrapezoidTest tt=new TrapezoidTest(null, 10);
		TriangleTest trt=new TriangleTest(area, 8);
		
		Object[] obj= {s,ct,et,pt,rt,st,sqt,tt,trt};
		return obj;
		
		
	}

}
