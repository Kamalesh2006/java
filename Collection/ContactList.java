import java.util.*;
public class ContactList {
	public static void main(String [] args) {
		TreeMap<String,Integer> t = new TreeMap<String,Integer>();
		t.put("Kamalesh",202409);
		t.put("Sangeet",201451);
		t.put("Ravi",458781);
		Scanner sh= new Scanner(System.in);
		System.out.println("Enter the name to find phone number");
		String name = sh.nextLine();
		System.out.println(t.get(name));
		System.out.println("Enter the phone number to find the name");
		int num = sh.nextInt();
		Set<Map.Entry<String,Integer>> entries = t.entrySet();
		for( Map.Entry<String, Integer> entry : entries ){
            
            if(entry.getValue().equals(num)){
                System.out.println(entry.getKey());
                break;
            }
        }
		
	}
}
