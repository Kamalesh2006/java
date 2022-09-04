
public class Exercise33 {

	public static void main(String[] args) {
		if (args.length !=4) {
			System.out.println("Please enter 4 integer numbers");
		}else {
			int i=0;
			int[] a= new int[4];
			for (String x: args) {
				a[i]= Integer.parseInt(x);
				i++;
			}
			int[][] array = new int[2][2];
			int l=0;
			for (int j=0; j<2;j++) {
				for (int k=0;k<2; k++) {
					array[j][k]= a[l];
					l++;
				}
			}
			// the given array is 
			System.out.println("The given array is" +"\n");
			for (int j=0; j<2;j++) {
				for (int k=0;k<2; k++) {
					System.out.print(array[j][k] + " ");
				}
				System.out.println();
			}
			//reverse the 2*2 matrix
			System.out.println("\nReversed array is" +"\n");
			for (int j=1; j>-1;j--) {
				for (int k=1;k>-1; k--) {
					System.out.print(array[j][k] + " ");
				}
				System.out.println();
			}
			
		}

	}

}
