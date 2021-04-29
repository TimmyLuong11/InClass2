
public class Point 
{
	private int x;
	private int y;
	//private int a;
	static private int counter = 0;
	
	public Point()
	{
		this(0,0);
		System.out.println("Using a deffault consturctor");
	}

	public Point(int x, int y)
	{
		if(x >= 0)
			this.x = x;
		if(y >= 0)
			this.y = y;
		++counter;
	}

	public Point(Point p)
	{
		this(p.getX(), p.getY());
	}
	
	public int getX() 
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	@Override
	public String toString() 
	{
		return "Point [x=" + x + ", y=" + y + "]";
	}

}





