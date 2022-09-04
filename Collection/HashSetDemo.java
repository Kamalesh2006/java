import java.util.*;
public class HashSetDemo {
	HashSet set = new HashSet();
	public static void main(String[] args) {
		HashSetDemo h = new HashSetDemo();
		System.out.println(h.addCountry("India"));
		System.out.println(h.addCountry("India"));
		System.out.println(h.addCountry("Pakistan"));
		System.out.println(h.addCountry("Bangladesh"));
		//finding whether country is present or not
		System.out.println(h.findCountry("India"));
		System.out.println(h.findCountry("Australia"));
		
		//printing all countries
		h.printAllCountries();
		
		
		
	}
	public boolean addCountry(String countryName) {
		return set.add(countryName);
	}
	public String findCountry(String countryName) {
		if (set.contains(countryName)) {
			return countryName;
		}
		else {
			return "Country Not Found";
		}
	}
	public void printAllCountries() {
		Iterator l = set.iterator();
		//Enumerator e = set.iterator();
		while (l.hasNext()) {
			System.out.println(l.next());
		}
	}
	
	
	
}
