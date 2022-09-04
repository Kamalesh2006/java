import java.util.Scanner;
public class Exercise23 {

	public static void main(String[] args) {
		int[] a = {10,22,32,25,74};
		Scanner sh= new Scanner(System.in);
		int elem= sh.nextInt();
		int flag=0,temp=0;
		for (int i = 0; i <a.length; i++) {
			flag=0;
			if(elem== a[i]) {
				temp = i;
				flag= 1;
				break;
			}
		}
		if (flag==0) {
			System.out.println(-1);
		}else {
			System.out.println(temp);
		}
	}

}
