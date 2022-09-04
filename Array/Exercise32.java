
public class Exercise32 {

	public static void main(String[] args) {
		middleWay(new int []{1,2,3},new int []{2,4,5});

	}
	public static void middleWay(int[] a, int[] b) {
		int length = a.length;
		int middle =(length/2);
		int[] c= new int [] {a[middle],b[middle]};
		for (int x :c) {
			System.out.print(x + "\t");
		}
	}

}
