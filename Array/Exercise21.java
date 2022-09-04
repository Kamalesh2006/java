
public class Exercise21 {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		int sum = 0;
		for (int x : a) {
			sum = sum + x;
		}
		System.out.println(sum);
		int length = a.length;
		double avg= sum/length;
		System.out.println(avg);

	}

}
