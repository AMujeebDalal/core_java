public class Thi5
{
	int a=5;
	Thi5()
	{
		Thi6 obj1=new Thi6(this);
		obj1.add2();
	}
	public static void main(String[] args)
	{
		Thi5 obj=new Thi5();
	}
}
class Thi6
{
	Thi5 obj;
	Thi6(Thi5 obj)
	{
		this.obj=obj;
	}
	public void add2()
	{
		System.out.println(obj.a);
	}
}
