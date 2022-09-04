//return short + long + short
import java.util.Scanner;
public class Exercise12 {
	
	public static void main(String[] args) {
		Scanner sh = new Scanner(System.in);
		String s1= sh.next();
		String s2 = sh.next();
		int flag=0;
		if (s1.length()<s2.length()) {
			//s1 is shorter
			flag=1;
		}else {
			//s2 is shorter
			flag=0;
		}
		if(flag==0) {
			System.out.println(s2+s1+s2);
		}else {
			System.out.println(s1+s2+s1);
		}
		
	}

}
