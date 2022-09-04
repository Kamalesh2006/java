
public class Exercise30 {

	public static void main(String[] args) {
		int[] a = {2,4,7,88,48,7,9,7};
		oddeven(a);
	}
	public static void oddeven(int[] a) {
		int left = 0;
		int right = a.length-1;
		while (left < right) {
			while(a[left]%2==0 && left<right) {
				left++;
			}
			while (a[right]%2!=0 && left< right){
				right--;
			}
			if(left < right) {
				int x= a[left];
				a[left]= a[right];
				a[right]= x;
			}
		}
		for(int x : a) {
			System.out.print(x + "\t");
		}

	}
}

