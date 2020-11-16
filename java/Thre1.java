class Thre1
{
	public static void main(String[] args)
	{
		System.out.println("hello");
		Thread t=Thread.currentThread();
		String st=t.getName();
		//String st=Thread.currentThread().getName();
		System.out.println(t);
	}
}