public class Test
{
	public static void main(String[] args)
	{
		int a=5;
		try
		{
			int t=args.length;
			int c=a/t;
			int d[]=new int[5];
			d[10]=12;
		}
		/**catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			e1.printStackTrace();
		}*/
		catch(Exception e3)
		{
			e3.printStackTrace();
		}
		System.out.println("hello");
	}
}