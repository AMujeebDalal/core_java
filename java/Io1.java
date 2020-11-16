import java.io.*;
public class Io1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any character");
		char ch=(char)br.read();
		System.out.println("Enter character is:"+ch);
	}
}