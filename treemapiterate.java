import java.util.*;
public class treemapiterate {

	public static void main(String[] args) {
		 TreeMap<String, String> treemap = new TreeMap<String, String>();
		    treemap.put("Key1","Item1");
		    treemap.put("Key2","Item2");
		    treemap.put("Key3","Item3");
		    treemap.put("Key4","Item4");
		    treemap.put("Key5","Item5");
		    Set set = treemap.entrySet();
		    Iterator it = set.iterator();
		    while(it.hasNext()) {
		      Map.Entry me = (Map.Entry)it.next();
		      System.out.print("Key is: "+me.getKey() + " & ");
		      System.out.println("Value is: "+me.getValue());
		    } 

	}

}
