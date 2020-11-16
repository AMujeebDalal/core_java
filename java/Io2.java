import java.io.*;
public class Io2
{
	public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your name");
	String st=br.readLine();
	System.out.println("Enter your rollno");
	int t=Integer.parseInt(br.readLine());
	System.out.println("your Rollno and Name:"+t+""+st);
	}
}