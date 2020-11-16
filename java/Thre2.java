class Thre2 extends Thread //one of two
//class Thre2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		Thre2 t1=new Thre2();
		Thre2 t2=new Thre2();
		//Thread obj=new Thread(t1);
		t1.start();
		t2.start();
	}
} 