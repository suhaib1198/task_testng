
public class Triangle implements Shape{
	
	private double h;
	private double b;
	
	

	public Triangle(double h, double b) {
		this.h = h;
		this.b = b;
	}


	public double getArea() {
		// TODO Auto-generated method stub
		if(this.h>0&&this.b>0)
		return this.b*this.h*0.5;
		return 0;
	}

}
