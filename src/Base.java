
public class Base 
{
	private int data;

	public Base(int data)
	{
		this.data = data;
	}

	@Override
	public String toString() {
		return "Base [data=" + data + "]";
	}
	
	public static void main(String[] args)
	{
		Base b = new Base(1);
		System.out.println(b);
	}
}
