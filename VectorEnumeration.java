import java.util.*;
import java.util.Enumeration;
public class VectorEnumeration {

	public static void main(String[] args) {
		 Vector<String> vector = new Vector<String>();
		 vector.add("Chaitanya");
		    vector.add("vani");
		    vector.add("Apoorv");
		    vector.add("ramu");
		    vector.add("raju");
		 Enumeration en = vector.elements();
		 System.out.println("Vector elements are: ");
		    while(en.hasMoreElements())
		       System.out.println(en.nextElement());
		  }
		}

	
