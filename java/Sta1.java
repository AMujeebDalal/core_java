/**public class Sta1
{
	int a=0;
	Sta1()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Sta1 obj=new Sta1();
		Sta1 obj1=new Sta1();
		Sta1 obj2=new Sta1();
	}
	
}*/
//by way of static variable
public class Sta1
{
	static int a=0;
	Sta1()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Sta1 obj=new Sta1();
		Sta1 obj1=new Sta1();
		Sta1 obj2=new Sta1();
	}
}