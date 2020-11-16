public class Arr1
{
	public static void main(String args[])
	{
		int count=0;
		float[] costs;
		costs=new float[5];
		while(count<5)
		{
			System.out.print("Data: ");
			costs[count]=WellHouseInput.readNumber();
			if (costs[count]<=0.0)break;
			count++;
		}
		for(int k=count-1;k>=0,k--)
			{System.out.println(costs[k]);
	}
}
}