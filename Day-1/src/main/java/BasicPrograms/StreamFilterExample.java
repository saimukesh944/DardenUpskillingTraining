package BasicPrograms;

import JavaPrograms.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> obj=new ArrayList<Product>();
		obj.add(new Product(1,"HP Laptop",25000f));
		obj.add(new Product(2,"Dell Laptop",30000f));
		obj.add(new Product(3,"Sony Laptop",250000f));
		obj.add(new Product(4,"Lenevo Laptop",32000f));
		obj.add(new Product(5,"Apple Laptop",90000f));
		
//		List < Float > productPriceList = obj.stream().filter((product) -> product.getPrice() > 25000)
//	            .map((product) -> product.getPrice()).collect(Collectors.toList());
//	        // displaying data
//	        productPriceList.forEach((price) -> System.out.println(price)); 
		
		List<Product> fil=obj.stream().filter(n->n.getId()>2).collect(Collectors.toList());
//		fil.forEach(System.out::print);
		Iterator <Product>itr=fil.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Double sumPrices =   
				 obj.stream()  
	                         .collect(Collectors.summingDouble(x->x.price));  // collecting as list  
	     System.out.println("Sum of prices: "+sumPrices); 
	     Double ids =   
				 obj.stream()  
	                         .collect(Collectors.summingDouble(x->x.id));  // collecting as list  
	     System.out.println("Sum of ids: "+ids);
	     
	     Long noOfElements = obj.stream()  
                 .collect(Collectors.counting());  
System.out.println("Total elements : "+noOfElements);  

        
    }
	  
	}


