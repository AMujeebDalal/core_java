public class Program
{
 public static void main(String args[])
{
	//String str="pramod";
	//String str1="pramod";
	String str1=new String("pramod");
	String str=new String("pramod");
	if(str==str1)
	{
		System.out.println("This is equal");
	}
	else
	{
		System.out.println("this is not equal");
	}
	if(str.equals(str1))
	{
			System.out.println("This is equal");
	}
	else
	{
		System.out.println("this is not equal");
	}
}
}