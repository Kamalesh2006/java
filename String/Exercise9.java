//n copies of the string 
import java.util.Scanner;
public class Exercise9 {

	public static void main(String[] args) {
		Scanner sh = new Scanner (System.in);
		String s = sh.next();
		int length = s.length();
		String sub= s.substring(0,2);
		while (length>0) {
			System.out.print(sub);
			length--;
		}
		

	}

}
