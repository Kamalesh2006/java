import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		Scanner sh = new Scanner(System.in);
		String[] s= sh.next().split(",");
		int length1=s[0].length();
		s[0]=s[0].toLowerCase();
		s[1]=s[1].toLowerCase();
		String p;
		if(s[0].charAt(length1-1)==s[1].charAt(0)) {
			s[0]=s[0].substring(0, length1-1);
			p = s[0] + s[1];
		}
		else {
			p= s[0] +" " + s[1];
		}
		System.out.println(p);
	}

}
