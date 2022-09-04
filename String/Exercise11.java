//return a string without first and last character of the string
import java.util.Scanner;
public class Exercise11 {
	public static String newString(String s) {
		s = s.substring(1,s.length()-1);
		return s;
	}

	public static void main(String[] args) {
		Scanner sh= new Scanner (System.in);
		String s = sh.next();
		String sub = newString(s);
		System.out.println(sub);
	}

}
