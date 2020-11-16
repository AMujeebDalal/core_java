 class Sup
{
	int a=10;
	Sup()
	{
		System.out.println("Super Constructor");
	}
	public void add()
	{
		System.out.println("hello");
	}
}
public class Sub extends Sup
{
	int a=20;
	Sub()
	{
		super();
	}
	public void add()
	{
		System.out.println("hi");
	}
	public void message()
	{
		this.add();
		super.add();
		System.out.println(super.a);
	}
	public static void main(String[] args)
	{
		Sub obj=new Sub();
		obj.message();
	}
}
	
