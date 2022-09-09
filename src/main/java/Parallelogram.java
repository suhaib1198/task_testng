
public class Parallelogram implements Shape{
	private double h;
	private double b;
	

	public Parallelogram(double h, double b) {
		super();
		this.h = h;
		this.b = b;
	}


	public double getArea() {
		if(this.h>0&&this.b>0)
		return this.b*this.h;
		return 0;
	}

}
