import java.util.*;
public class Removeallvector {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		 
	    //Adding elements to the Vector
	    vector.add("C++");
	    vector.add("Java");
	    vector.add("Cobol");
	    vector.add("C");
	    vector.add("Oracle");
         System.out.println("Current size of Vector: "+vector.size());
	     vector.clear();//clear method
	     System.out.println("Size of Vector after clear(): "+vector.size());
	 

	}

}
