import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();
	     tset.add("Abhijeet");
	     tset.add("Ram");
	     tset.add("Kevin");
	     tset.add("Singh");
	     tset.add("Rick");
	      tset.add("Ram"); 
	   System.out.println("TreeSet contains: ");
	     for(String temp : tset){
	        System.out.println(temp);
	     }
	  }
}
