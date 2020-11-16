import java.io.*;
public class Io7
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the size of matrix");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=	Integer.parseInt(br.readline());
		int a[]=new int [n];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br)
		}
	}
}