import java.util.*;
public class ListAssignment01 {
	public static void printAll(ArrayList a) {
		ListIterator l = a.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
	}
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Java");
		l.add("from");
		l.add("Wipro");
		ListAssignment01.printAll(l);
	}
}
