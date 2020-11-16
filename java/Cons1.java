public class Cons1
{
	int a;
	String str;
	Cons1()
	{
		System.out.println("hi");
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		Cons1 obj=new Cons1();
		obj.display();
	}
	
}