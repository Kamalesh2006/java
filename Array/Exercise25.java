//largest 2 numbers and smallest 2 numbers
public class Exercise25 {

	public static void main(String[] args) {
		int[] a = {22,1,45,77,5,12};
		int temp;
		int length= a.length;
		for (int i = 0; i<a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Max two values are :" + a[length-1] + " "+ a[length-2]);
		System.out.println("Min two values are :" + a[0] + " "+ a[1]);
	}

}
