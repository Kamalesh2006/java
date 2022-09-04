//given a string and integer n print a new string made of n repetitions of the last n characters n times.
import java.util.Scanner;
public class Exercise16 {

	public static void main(String[] args) {
		Scanner sh = new Scanner(System.in);
		String[] sArr = sh.next().split(",");
		String s = sArr[0];
		int n = Integer.parseInt(sArr[1]);
		int counter =n;
		StringBuffer sb= new StringBuffer();
		if (n<= s.length()) {
			while (counter>0) {
				sb.append(s.substring(n-1));
				counter--;
			}
			System.out.println(sb);
		}
		else {
			System.out.println("Given number is greater than the length of the String");
		}

	}

}
