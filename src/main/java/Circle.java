
public class Circle implements Shape {

	private double radius;

	public Circle(double r){
		this.radius = r;
	}
	
	
	public double getArea(){
		if(this.radius>0)
		return Math.PI*this.radius*this.radius;
		return 0;
	}

	public double getRadius(){
		return this.radius;
	}
}