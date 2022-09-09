
public class Sector implements Shape{
	private double r;
	private double a;
	

	public Sector(double r, double a) {
		super();
		this.r = r;
		this.a = a;
	}


	public double getArea() {
		// TODO Auto-generated method stub
		if((this.a)>0&&this.r>0)
		return (this.a)*this.r*this.r*0.5;
		return 0;
	}

}
