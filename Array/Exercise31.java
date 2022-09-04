
public class Exercise31 {

	public static void main(String[] args) {
		int[] a= {1,4,1,4,1,4,1,4,4,1,7};
		only14(a);

	}
	public static void only14(int[] a) {
		int flag =0;
		for (int x : a) {
			if (x==1 || x==4) {
				continue;
			}else {
				flag=1;
				break;
			}
		}
		if (flag==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
}
