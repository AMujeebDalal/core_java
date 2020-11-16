import java.io.*;
import java.util.*;
public class Io3
{
	public static void main(String args[]) throws 	IOException
	{
		//InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String st=br.readLine();
		StringTokenizer st1=new StringTokenizer(st," ");
		String s1=st1.nextToken();
		String s2=st1.nextToken();
		String s3=st1.nextToken();
		s1=s1.trim();
		s2=s1.trim();
		s3=s1.trim();
		int t=Integer.parseInt(s2);
		float f=Float.parseFloat(s3);
		
	}
	
}