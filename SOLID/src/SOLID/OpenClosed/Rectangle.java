package SOLID.OpenClosed;

public class Rectangle extends Shape{
	
	 private double Width;
	 private double Height;
	 
	 
	 
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super();
		Width = width;
		Height = height;
	}

	public double getWidth() {
		return Width;
	}

	public void setWidth(double width) {
		Width = width;
	}

	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}

	@Override
	public double Area() {
        return Width*Height;
	}
	 
	 

}
