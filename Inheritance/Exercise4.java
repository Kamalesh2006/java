class Animal{
	public void eat() {
		System.out.println("Animal eat");
	}
	public void sleep() {
		System.out.println("Animal sleep");
	}
}
class Bird extends Animal{
	public void eat() {
		System.out.println("Birds eat");
	}
	public void sleep() {
		System.out.println("Birds sleep");
	}
	public void fly() {
		System.out.println("Birds fly");
	}
}
public class Exercise4 {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		a.sleep();
		Bird b= new Bird();
		b.eat();
		b.sleep();
		b.fly();

	}

}
