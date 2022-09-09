
public class Square implements Shape{
	private double a;
	private double b;
	

	public Square(double a,double b) {
		this.a = a;
		this.b = b;
	}



	public double getArea() {
		if(this.a>0&&this.b>0&&a==b)
			return this.a*this.b;
			return 0;
	}

}
