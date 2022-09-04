import java.util.Scanner;

class Fruit{
	protected String name;
	protected String taste;
	protected String size;
	public void eat() {
		Scanner sh = new Scanner(System.in);
		name = sh.next();
		taste = sh.next();
		size = sh.next();
		System.out.println(name + " is " + taste + " and is of size "+size);
	}
}
class Apple extends Fruit {
	public void eat() {
		super.name = "Apple";
		super.taste = "sweet";
		super.size="small";
		System.out.println(name + " is " + taste + " and is of size "+size);
	}	
}
class Orange extends Fruit{
	public void eat() {
		super.name = "Orange";
		super.taste = "sour";
		super.size="round and small";
		System.out.println(name + " is " + taste + " and is of size "+size);
	}	
}
public class Exercise6 {

	public static void main(String[] args) {
		Apple a = new Apple();
		a.eat();
		Orange o = new Orange();
		o.eat();

	}

}
