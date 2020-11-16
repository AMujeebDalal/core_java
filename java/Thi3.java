public class Thi3
{
	int a;
	String str;
	Thi3()
	{
		System.out.println("hi");
	}
	Thi3(int a,String str)
	{
		this();
		this.a=a;
		this.str=str;
		//this(); this must be first statement only.
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		Thi3 obj=new Thi3(14,"Program");
		obj.display();
	}
}