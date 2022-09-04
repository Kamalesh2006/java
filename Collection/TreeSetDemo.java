import java.util.TreeSet;
import java.util.*;
class Employee {
	int empID;
	String name;
	float salary;
	Employee(int empID,String name, float salary){
		this.empID= empID;
		this.name= name;
		this.salary=salary;
	}
	public String toString() {
		return empID +" " + name +" " + salary;
	}
}
class MyComparator implements Comparator<Employee>{
	public int compare(Employee s1,Employee s2) {
		int i = (int) s1.salary;
		int j = (int) s2.salary;
		if ( i==j)
			return 0;
		else if (i>j)
			return -1;
		else
			return 1;
	}
}
public class TreeSetDemo {
	TreeSet<Employee> t = new TreeSet<Employee>(new MyComparator());
	public boolean addEmployee(Employee emp) {
		return t.add(emp);
	}
	public void displayAllEmployee() {
		System.out.println(t);
			
		}
	public static void main(String[] args) {
		TreeSetDemo ts = new TreeSetDemo();
		Employee e1 = new Employee ( 101,"Kamalesh",40000.0f);
		Employee e2 = new Employee (102,"Sangeet",45000.0f);
		System.out.println(ts.addEmployee(e1));
		System.out.println(ts.addEmployee(e2));
		System.out.println(ts.addEmployee(e2));
		ts.displayAllEmployee();

	}

}
