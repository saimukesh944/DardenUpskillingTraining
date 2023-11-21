package CollectionsAssignments;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

class Contact{
	private long phNumber;
	private String name;
	private String email;
	private gender g;
	
	enum gender{
		Male,
		Female;
	}
	public Contact(long phNumber, String name, String email, gender g) {
		super();
		this.phNumber = phNumber;
		this.name=name;
		this.email=email;
		this.g=g;
	}
	public long getPhNumber() {
		return phNumber;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public gender getG() {
		return g;
	}
}
public class Collections01 {

	public static void main(String[] args) {
		Contact c1 = new Contact(1234567890, "abc", "abc@gmail.com", Contact.gender.Female);
		Contact c2 = new Contact(1234567891, "bcd", "bcd@gmail.com", Contact.gender.Male);
		Contact c3 = new Contact(1234567892, "cde", "cde@gmail.com", Contact.gender.Female);
		
		Map<Long,Contact> c = new TreeMap<>(Collections.reverseOrder());
		c.put(c1.getPhNumber(),c1);
		c.put(c2.getPhNumber(),c2);
		c.put(c3.getPhNumber(),c3);
		
		for(long l: c.keySet()) {
			System.out.println(l);
		}

		for(Contact l: c.values()) {
			System.out.println(l.getName());
			System.out.println(l.getEmail());
			System.out.println(l.getG());
		
		}
		System.out.println(c);
		for(Map.Entry<Long, Contact> entry : c.entrySet()) {
			System.out.println("Key: "+entry.getKey());
			System.out.println("Name "+entry.getValue().getName());
			System.out.println("Email "+entry.getValue().getEmail());
			System.out.println("Gender "+entry.getValue().getG());
			System.out.println();
		}
	}

}
