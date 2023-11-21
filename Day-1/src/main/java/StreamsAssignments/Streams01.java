package StreamsAssignments;

import java.util.ArrayList;

class Fruit{
	private String name;
	private int calories;
	private int price;
	private String color;
	
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public int getCalories() {
		return calories;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
}
public class Streams01 {

	public static void main(String[] args) {
		Fruit f1=new Fruit("apple",50,25,"red");
		Fruit f2=new Fruit("Mango",35,50,"yellow");
		Fruit f3=new Fruit("Guava",80,15,"Green");
		
		ArrayList<Fruit> f=new ArrayList<>();
		f.add(f1);
		f.add(f2);
		f.add(f3);
		

		
		f.stream()
		.filter(i -> i.getCalories()<100)
		.sorted((fr1,fr2) -> fr2.getCalories()-fr1.getCalories())
		.forEach(n -> System.out.println(n.getName()));
		

		
		System.out.println();
		

		
		f.stream()
		.sorted((fr1,fr2) -> fr1.getColor().compareTo(fr2.getColor()))
		.forEach(n -> System.out.println(n.getName()+":"+n.getColor()));
		

		
		System.out.println();
		

		
		f.stream()
		.filter(fr -> fr.getColor().contentEquals("red"))
		.sorted((fr1,fr2) -> fr1.getPrice()-fr2.getPrice())
		.forEach(n -> System.out.println(n.getName()));
	}
}
