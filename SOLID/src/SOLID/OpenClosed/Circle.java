package SOLID.OpenClosed;

public class Circle extends Shape{
	
    public double Radius;
    
    @Override
    public double Area()
    {
        return Radius*Radius*Math.PI;
    }
}
