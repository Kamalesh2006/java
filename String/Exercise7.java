
public class Exercise7 {

	public static void main(String[] args) {
		String s= "malayalam";
		int length = s.length();
		int flag=0;
		for (int i=0;i<s.length()/2;i++) {
			if (s.charAt(i)!=s.charAt(length-1)) {
				flag=1;
				break;
			}
			length--;
		}
		if (flag==0) {
			System.out.println("Given number is palindrome");
		}
		else {
			System.out.println("Given number is not a palindrome");
		}
	}

}
