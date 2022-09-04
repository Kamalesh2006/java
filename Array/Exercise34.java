// finding the largest number in the 3*3 matrix
public class Exercise34 {

	public static void main(String[] args) {
		if (args.length !=9) {
			System.out.println("Please enter 9 integer numbers");
		}else {
			int i=0;
			int[] a= new int[9];
			for (String x: args) {
				a[i]= Integer.parseInt(x);
				i++;
			}
			int[][] array = new int[3][3];
			int l=0;
			for (int j=0; j<3;j++) {
				for (int k=0;k<3; k++) {
					array[j][k]= a[l];
					l++;
				}
			}
			// the given array is
			System.out.println("the given array is \n");
			for (int j=0; j<3;j++) {
				for (int k=0;k<3; k++) {
					System.out.print(array[j][k] + " ");
				}
				System.out.println("\n");
			}
			// the biggest number in the array is
			int max = array[0][0];
			for (int j=0; j<3;j++) {
				for (int k=0;k<3; k++) {
					if (array[j][k]>max) {
						max = array[j][k];
					}
				}
				
			}
			System.out.println("The biggest number in the array is " + max);
			
		}


	}

}
