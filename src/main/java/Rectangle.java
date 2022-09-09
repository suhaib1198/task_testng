
public class Rectangle implements Shape {

	private double width;
	private double height;
	
	public Rectangle(double w, double h){
		this.width=w;
		this.height=h;
	}
	

	public double getArea() {
		if(this.height>0&&this.width>0)
		return this.height*this.width;
		return 0;
	}

}