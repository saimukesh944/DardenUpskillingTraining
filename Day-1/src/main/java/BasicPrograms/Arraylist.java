package BasicPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> obj=new ArrayList<Integer>();
		
		obj.add(1);
		obj.add(2);
		obj.add(4);
		
		Iterator<Integer> itr=obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
