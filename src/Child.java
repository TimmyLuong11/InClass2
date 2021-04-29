import java.util.ArrayList;
import java.util.List;

public class Child extends Base 
{
	protected int data;
	
	public Child(int data)
	{
		super(data);
		this.data = data * 2;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Child [data=" + data + "]";
	}


	public static void main(String[] args)
	{
		Child child = new Child(1);
		System.out.println(child);
		
		
		Base base = new Base(1);
		System.out.println(base);
		Base base1 = new Child(1);
		System.out.println(base1);
		
		List list = new ArrayList();
		list.add(base);
		list.add(base1);
		list.add(new Integer(10));
		
		for(Object b: list)
		{
			System.out.println(b);
		}
	}
}
