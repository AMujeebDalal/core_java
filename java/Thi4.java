public class Thi4
{
	public void add1()
	{
		System.out.println("hello");
	}
	public void add2()
	{
		System.out.println("hi");
		this.add1(); //explicit call
	}
	public static void main(String[] args)
	{
		Thi4 obj=new Thi4();
		obj.add2();
	}
}