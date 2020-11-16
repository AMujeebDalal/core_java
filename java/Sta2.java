public class Sta2
{
	static String collegename="NIT";
	int enroll;
	String name;
	Sta2(int enroll,String name)
	{
		this.enroll=enroll;
		this.name=name;
	}
	public void display()
	{
		System.out.println("collegename,enroll & name of student:"+collegename' '+enroll' '+name);
	}
	public static void main (String[] args)
	{
		Sta2 obj=new Sta2(9,"Pramod");
		obj.display();
	}
	
}