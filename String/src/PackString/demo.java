package PackString;

public class demo {
	static int a=10;
	
	public void s()
	{
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	 
	
	
	
	public static void main(String[] args) {
		demo d=new demo();
		d.s();
		
		
		/*Encapsulation e=new Encapsulation();
		
		Encapsulation r=new Encapsulation(20);
		e.test();

		r.test();
        //System.out.println(e.a); 
		//can't access private data*/
	
	
	}

}
