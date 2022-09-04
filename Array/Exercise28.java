
public class Exercise28 {

	public static void main(String[] args) {
		int[] x = {2,15,6,4,5,7,9,6,5,8,9,7};
		int a = 6;
		int b = 7;
		int sum = 0;
		for (int i=0;i<x.length;i++) {
			if (x[i]==a) {
				for (int j=i;j<x.length;j++) {
					if (x[j]==b) {
						i=j;
						i++;
						break;
					}
				}
			}
			if (i<x.length)
			sum= sum+x[i];
		}
		System.out.println(sum);
	}

}
