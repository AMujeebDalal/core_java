import java.util.*;
public class Coll2;
{
	public static void main(String[] args)
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add(1,"Set");
		ar.add(2,"List");
		ar.add(3,"Map");
		System.out.println("Array list is" +ar);
		ar.remove(0);
		ar.remove(3);
		Iterator<String> it=ar.iterator();
		while(it.hasNext());
		{
			String st=(String)it.next();
			System.out.println(st);
		}
	}
}