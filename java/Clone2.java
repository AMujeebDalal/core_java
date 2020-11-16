class Clone1 implements Cloneable
{
	int i;
	String str;
	Clone1(int i,String str)
	{
		this.i=i;
		this.str=str;
	}
	public void get1()
	{
		System.out.println("id="+i);
		System.out.println("name="+str);
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class Clone2
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Clone1 obj=new Clone1(12,"pramod");
		obj.get1();
		Clone1 obj1=(Clone1)obj.clone();
		obj1.get1();
	}
}