public class Thi7
{
	public void add()
	{
		System.out.println("hi");
		add1(this);
	}
	public void add1(Thi7 obj1)
	{
		System.out.println("this");
	}
	public static void main(String[] args)
	{
		Thi7 obj=new Thi7();
		obj.add();
	}
}