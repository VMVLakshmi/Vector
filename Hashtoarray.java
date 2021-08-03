import java.util.*;
public class Hashtoarray {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
	     hset.add("Steve");
	     hset.add("Matt");
	     hset.add("Govinda");
	     hset.add("John");
	     hset.add("Tommy");
	 
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: "+ hset);
	 
	     // Creating a List of HashSet elements
	     List<String> list = new ArrayList<String>(hset);
	 
	     // Displaying ArrayList elements
	     System.out.println("ArrayList contains: "+ list);
	  }
	}

	


