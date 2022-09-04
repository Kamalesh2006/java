//return the string without x char
import java.util.Scanner;
public class Exercise13 {
	
	public static String withoutX(String s) {
		char[] c = s.toCharArray();
		int length = c.length;
		if (c[0]=='x' && c[length-1]=='x') {
			String sub=s.substring(1,length-1);
			return sub;
		}
		else {
			return s;
		}
	}

	public static void main(String[] args) {
		Scanner sh= new Scanner(System.in);
		String s = sh.next();
		System.out.println(withoutX(s));

	}

}
