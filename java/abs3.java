abstract class abs1
{
	public abstract void add();
	public void add1()
	{
		System.out.println("hi");
	}
}
class abs2 extends abs1
{
	public void add()
	{
		System.out.println("hello");
	}
}
class abs3
{
	public static void main(String[] args)
	{
		abs1 obj; //reference variable of abs1
		abs2 obj1=new abs2();
		obj=obj1;
		obj.add();
	}
}