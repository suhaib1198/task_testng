import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDriver {
	Shape r;
	Shape sq;
	Shape t;
	Shape tr;
	Shape e;
	Shape p;
	Shape s;
	Shape c;
	
	@BeforeSuite
	public void start() {
		System.out.println("Start Testing");
	}
	
	@BeforeMethod
	public void Shapes() {
		System.out.println("Testing");
	}
	
	@Test
    @Parameters ({"val1", "val2","val3"})
    public void Rectangle(double v1, double v2,double result) {
		
		 r=new Rectangle(v1,v2);
    	
        System.out.println("The area of Rectangle is with height "+v1+" and width "+v2 +" is "+ r.getArea()+" and expected value is "+result);
        Assert.assertEquals(r.getArea(), result);
    }
    
    @Test
    @Parameters ({"val1", "val2","val3"})
    public void Square (double v1, double v2,double result) {
    	 sq=new Square(v1, v2);
    	
        System.out.println("The area of Square is with height "+v1+" and width "+v2 +" is "+ sq.getArea()+" and expected value is "+result);
        Assert.assertEquals(sq.getArea(), result);
    }
    
   
    
    @Test
    @Parameters ({"val1", "val2","val3"})
    public void  Triangle (double v1, double v2,double result) {
    	 t=new  Triangle(v1, v2);
    	
        System.out.println("The area of Triangle is with height "+v1+" and base "+v2 +" is "+ t.getArea()+" and expected value is "+result);
        Assert.assertEquals(t.getArea(), result);
    }
    
    
    
    
    
    @Test
    @Parameters ({"val1", "val2","val3","val4"})
    public void  Trapezoid (double v1, double v2,double v3,double result) {
    	 tr=new  Trapezoid(v1, v2, v3);
    	
        System.out.println("The area of Trapezoid is with height "+v1+" and width "+v2 +" and base "+v3+" is "+ tr.getArea()+" and expected value is "+result);
        Assert.assertEquals(tr.getArea(), result);
    }
    
    

    @Test
    @Parameters ({"val1", "val2","val3"})
    public void  Ellipse (double v1, double v2,double result) {
    	e=new  Ellipse(v1, v2);
        System.out.println("The area of Ellipse is with the length of the Semi-major Axis "+v1+" and length of the Semi-minor Axis "+v2 +" is "+ e.getArea()+" and expected value is "+result);
        Assert.assertEquals(e.getArea(), result);
        
    }
    
    
    
    @Test
    @Parameters ({"val1", "val2","val3"})
    public void  Parallelogram (double v1, double v2,double result) {
    	 p=new Parallelogram(v1, v2);
        System.out.println("The area of Parallelogram is with height "+v1+" and base "+v2 +" is "+ p.getArea()+" and expected value is "+result);
        Assert.assertEquals(p.getArea(), result);
        
    }
    
    
    @Test
    @Parameters ({"val1", "val2","val3"})
    public void  Sector (double v1, double v2,double result) {
    	 s=new Sector(v1, v2);
        System.out.println("The area of Sector is with raduis "+v1+" and angle "+v2 +" is "+ s.getArea()+" and expected value is "+result);
        Assert.assertEquals(s.getArea(), result);
        
    }
    
    @Test
    @Parameters ({"val1", "val2",})
    public void  Circle (double v1,double result) {
    	 c=new Circle(v1);
        System.out.println("The area of Circle is with raduis "+v1+" is "+ c.getArea()+" and expected value is "+result);
        Assert.assertEquals(c.getArea(), result);
        
    }
    @AfterTest
    public void Done() {
    	System.out.println("Done");
    }
    
    @AfterSuite
    public void End() {
    	System.out.println("The End");
    }
    
    
    

}
