//given two strings form a new string with first letter of a and first letter of b and so on. 
import java.util.Scanner;
public class Exercise15 {

	public static void main(String[] args) {
		Scanner sh = new Scanner(System.in);
		String[] s= sh.next().split(",");
		String a = s[0];
		String b = s[1];
		StringBuffer y= new StringBuffer();
		String rem;
		int shrt;
		if (a.length()>b.length()) {
			shrt= b.length();
			rem=a.substring(shrt);
			
		}
		else {
			shrt = a.length();
			rem=b.substring(shrt);
		}
		
		for (int i= 0; i < shrt; i++) {
			y = y.append(a.charAt(i));
			y = y.append(b.charAt(i));
		}
		y=y.append(rem);
		System.out.println(y);

	}

}
