package com.example.demoDarden.Model;
//import org.springframework.data.annotation.Id;
//@Document(collection = "StudentsData")
public class Student {


	    private Long id;
	    private String name;
	    private int age;
	    private double salary;
	 
	    // Constructors, getters, setters
	 
	    public Student(Long id, String name, int age, double salary) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }
	 
	    // Getters and setters...
	 
	    public Long getId() {
	        return id;
	    }
	 
	    public void setId(Long id) {
	        this.id = id;
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public int getAge() {
	        return age;
	    }
	 
	    public void setAge(int age) {
	        this.age = age;
	    }
	 
	    public double getSalary() {
	        return salary;
	    }
	 
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	 
	    @Override
	    public String toString() {
	        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	    }
	}
