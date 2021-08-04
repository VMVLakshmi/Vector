import java.util.*;
public class Hashmapremoveall {

	public static void main(String[] args) {
		 HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		    hashmap.put(11,"Value1");
		    hashmap.put(22,"Value2");
		    hashmap.put(33,"Value3");
		    hashmap.put(44,"Value4");
		    hashmap.put(55,"Value5");
		    System.out.println("HashMap Elements: " + hashmap);
		    hashmap.clear();
		    System.out.println("After calling clear():");
		    System.out.println("---------------------");
		    System.out.println("HashMap Elements: " + hashmap); 
		 }

	}


