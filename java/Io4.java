import java.io.*;
import java.util.*;
public class Io4
{
	public static void main(String[] args)
	{
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		System.out.println("Enter Float:");
		Float f=sc.nextFloat();
		System.out.println("Enter Interger:");
		int t=sc.nextInt();
		System.out.println("enterd string is:"+st+" "+f+" "+t);
	}
}
