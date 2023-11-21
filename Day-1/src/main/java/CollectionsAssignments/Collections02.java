package CollectionsAssignments;

import java.util.HashSet;
import java.util.Iterator;

public class Collections02 {

	public static void main(String[] args) {
		

		
		HashSet<String> set = new HashSet<String>();
		set.add("mukesh");
		set.add("arun");
		set.add("kiran");
		set.add("noushin");
		set.add("mukesh");

		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
