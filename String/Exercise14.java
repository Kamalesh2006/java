//removing the characters that are to the left and right of *
import java.util.Scanner;
public class Exercise14 {

	public static void main(String[] args) {
		Scanner sh = new Scanner (System.in);
		String s = sh.next();
		int pos = s.indexOf('*');
		String newS= s.substring(0,pos-1) + s.substring(pos+2);
		System.out.println(newS);

	}

}
