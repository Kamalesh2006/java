class Calculator{
	public static int powerInt(int num1, int num2) {
		int result =1;
		while (num2>0) {
			result = result * num1;
			num2--;
		}
		return result;
	}
	public static double powerDouble(double num1,int num2) {
		double result;
		result=Math.pow(num1,num2);
		return result;
	}
}
public class Exercise2 {
	public static void main (String[] args) {
		System.out.println(Calculator.powerInt(5, 3));
		System.out.println(Calculator.powerDouble(6.0, 3));
	}
}
