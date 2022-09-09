
public class Trapezoid implements Shape{
        private double a;
		private double b;
		private double h;
		
		
	public Trapezoid(double a, double b, double h) {
			this.a = a;
			this.b = b;
			this.h = h;
		}


	public double getArea() {
		
		if(this.a>0&&this.b>0&&this.h>0&&this.a!=this.b)
		return (0.5*(a+b))*h;
		return 0;
	}

}
