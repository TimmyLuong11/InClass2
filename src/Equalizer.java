
public class Equalizer 
{
	private int data;
	public Equalizer(int data)
	{
		this.data = data;
	}
	
/*	public boolean equals(Equalizer e)
	{
		return(this.data == e.data);
	}*/
	public boolean equals(Object e)
	{
		System.out.println("Calling Object Equals");
		return(this.data == ((Equalizer)e).data);
	}
	
	@Override
	public String toString() {
		return "Equalizer [data=" + data + "]";
	}

	public static void main(String[] args)
	{
		Equalizer e1 = new Equalizer(10);
		Equalizer e2 = new Equalizer(10);
		Equalizer e3 = e1;
		
		if(e1 == e2)
		{
			System.out.println("They are the same");
		}
		else
		{
			System.out.println("They are different");
		}
		if(e1 == e3)
		{
			System.out.println("They are the same");
		}
		else
		{
			System.out.println("They are different");
		}
		if(e1.equals(e2))
		{
			System.out.println("They are the same");
		}
		else
		{
			System.out.println("They are different");
		}
		
		int x = 10;
		int y = 10;
		if(x == y)
		{
			System.out.println("They are the same");
		}
		else
		{
			System.out.println("They are different");
		}
		
		Equalizer z1 = new Equalizer(10);
		z1.data = 11;
		Object z2 = new Equalizer(10);
		if(z1. equals(z2))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}
		
		Integer x1 = new Integer(10);
		Integer y1 = new Integer(10);
		if(x1 == y1)
		{
			System.out.println("They are the same");
		}
		else
		{
			System.out.println("They are different");
		}
	}

}
