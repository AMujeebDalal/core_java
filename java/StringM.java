public class StringM
 {
 public static void main(String[] args)
 {
 String s1 = "hello there";
 char[] charArray = new char[5];

 System.out.printf("s1: %s", s1);
	s1.getChars(0, 5, charArray, 0);
 }
 }

