public class Thi1
{
	int a;
	String str;
	Thi1(int a,String str)
	{
		this.a=a;
		this.str=str;
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		Thi1 obj=new Thi1(13,"Program");
		obj.display();
	}
}