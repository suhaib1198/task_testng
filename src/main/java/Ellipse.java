
public class Ellipse implements Shape{
	private double a;
	private double b;
	

	public Ellipse(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}


	public double getArea() {
		if(this.a>0&&this.b>0)
		
		return Math.PI*this.a*this.b;
		return 0;
	}

}
