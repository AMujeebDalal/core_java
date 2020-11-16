public class Cons3
{
	int a;
	String str;
	Cons3(int b,String str1)
	{
		a=b;
		str=str1;
	}
	Cons3(Cons3 obj)
	{
		a=obj.a;
		str=obj.str;
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		Cons3 obj=new Cons3(12,"Program");
		Cons3 obj1=new Cons3(obj);
		obj.display();
		obj1.display();
	}
}