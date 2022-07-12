package PackString;

public class Encapsulation {
	
	private int a=10;
	private int b=20;
	
	public Encapsulation()
	{
		a=30;
		b=40;
	}
	
	public Encapsulation(int m)
	{
		a=50;
	}
	public void test()
	{
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
	}

	
	
}
