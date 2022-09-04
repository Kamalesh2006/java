// array sorting
public class Exercise26 {

	public static void main(String[] args) {
		int[] a = {22,1,45,77,5,12};
		int temp;
		for (int i = 0; i<a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j]=temp;
				}
			}
		}
		for (int x:a) {
			System.out.print(x + " ");
		}
	}

}