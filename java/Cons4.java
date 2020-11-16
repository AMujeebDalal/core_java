public class Cons4
{
	int a;
	String str;
	Cons4(int a,String str)
	{
		this.a=a;
		this.str=str;
	}
	Cons4()
	{}
	public void display()
	{
		System.out.println(a);
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		Cons4 obj=new Cons4(12,"Program");
		Cons4 obj1=new Cons4();
		obj1.a=obj.a;
		obj1.str=obj.str;
		obj.display();
		obj1.display();
	}
}