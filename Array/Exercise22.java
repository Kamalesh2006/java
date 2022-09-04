
public class Exercise22 {

	public static void main(String[] args) {
		int[] a = {10,5,30,55,77,99};
		int max = a[0];
		int min = a[0];
		for (int x = 1; x < a.length ; x ++) {
			if (a[x]> max) {
				max= a[x];
			}
			else if (a[x]< min) {
				min = a[x];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
