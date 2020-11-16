class typ3
{
	int a=10;
	String st="Pramod";
	public void add()
	{
		System.out.println(a);
	}
	public void add1()
	{
		System.out.println(st);
	}
}
public class typ4 extends typ3
{
	public void add()
	{
		System.out.println("sub");
	}
	public void add3()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) 
	{
		//typ3 obj=(typ3)new typ4();
		typ4 obj=(typ4) new typ3(); 
		obj.add3();
	}
	
}