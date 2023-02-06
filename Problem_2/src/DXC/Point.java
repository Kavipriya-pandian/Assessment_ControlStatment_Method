package DXC;

public class Point 
{
	private double x;
	private double y;
	
	public Point(double x, double y) {
		
		this.x = x;
		this.y = y;
	}

	public double getX() 
	{
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double distance()
	{
		//Use Math.sqrt(double d) method to calculate the square root, 
		//and Math.round(double d) method to round off the values.
				
				double d=Math.sqrt(((getX()-0)*(getX()-0))+((getY()-0)*(getY()-0)));
				return Math.round(d*100)/100.0;
				
	
		
	}
	public double distance(Point point)
	{
		
		
		double d=Math.sqrt(((x-point.x)*(x-point.x))+((y-point.y)*(y-point.y)));
		return Math.round(d*100)/100.0;
		
	}
	
}
