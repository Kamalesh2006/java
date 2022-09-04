//return half if length of the string is even and return null if length of the string is odd

import java.util.Scanner;
public class Exercise10 {

	public static void main(String[] args) {
		Scanner sh = new Scanner(System.in);
		String s = sh.next();
		int length = s.length();
		if (length%2==0) {
			s = s.substring(0,length/2);
		}
		else {
			s = null;
		}
		System.out.println(s);
	}

}
