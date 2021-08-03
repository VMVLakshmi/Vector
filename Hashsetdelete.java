import java.util.*;
public class Hashsetdelete {

	public static void main(String[] args) {
		 HashSet<String> hset = new HashSet<String>();
		  //add elements to HashSet
	     hset.add("Element1");
	     hset.add("Element2");
	     hset.add("Element3");
	     hset.add("Element4");
	     hset.add("Element5");
	      // Display HashSet elements
	     System.out.println("Before: HashSet contains: "+ hset);
	     hset.clear();//clear method(all empty)
	     System.out.println("After: HashSet contains: "+ hset);
	      

	}

}
