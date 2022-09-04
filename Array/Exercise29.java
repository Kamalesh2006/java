//remove 10 in an array and left shift the array
public class Exercise29 {

	public static void main(String[] args) {
		
		int[] a = {1,2,10,3,10,2,45,10,77};
		withoutTen(a);
	}
	public static void withoutTen(int[] a) {
		int count =0;
		for (int i =0;i<a.length; i++) {
			if (a[i]==10) {
				for (int j=i;j<a.length-1; j++) {
					a[j]= a[j+1];
				}
				count++;
			}
		
		}
		int length = a.length-1;
		int temp=0;
		while (count>0) {
			
			a[length -temp]=0;
			temp++;
			count--;
		}
		System.out.println(a.length);
		for(int x: a) {
	
			System.out.print(x + " ");
		}

	}

}
