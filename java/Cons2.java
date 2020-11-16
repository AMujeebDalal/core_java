public class Cons2
{
	int a;
	String str;
	Cons2(int b,String str1)
	{
		a=b;
		str=str1;
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		Cons2 obj= new Cons2(12,"Program");
		obj.display();
	}
}