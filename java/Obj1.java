
public class Obj1
{
	static void add(Object obj)
	{
		Class c=obj.getClass();
		String str=c.getName();
		System.out.println(str);
	}
	public static void main(String args[])
	{
		//Obj1 a=new Obj1(10);
		Obj1.add();
	}
}