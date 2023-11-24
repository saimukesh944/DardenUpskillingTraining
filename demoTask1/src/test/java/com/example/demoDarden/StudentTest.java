package com.example.demoDarden;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demoDarden.Model.Student;

public class StudentTest {
		 
	    @Test
	    public void testStudent() {
	        Student student = new Student(1L, "sai mukesh", 20, 50000.0);
	 
	        assertEquals(1L, student.getId().longValue());
	        assertEquals("sai mukesh", student.getName());
	        assertEquals(20, student.getAge());
	        assertEquals(50000.0, student.getSalary(), 0.01); // 0.01 is the delta for double comparison
	    }
	 
	    @Test
	    public void testSetters() {
	        Student student = new Student(1L, "sai mukesh", 20, 50000.0);
	 
	        student.setId(2L);
	        student.setName("sai mukesh");
	        student.setAge(25);
	        student.setSalary(60000.0);
	 
	        assertEquals(2L, student.getId().longValue());
	        assertEquals("sai mukesh", student.getName());
	        assertEquals(25, student.getAge());
	        assertEquals(60000.0, student.getSalary(), 0.01);
	    }
	 
	    @Test
	    public void testToString() {
	        Student student = new Student(1L, "sai mukesh", 20, 50000.0);
	 
	        assertEquals("Student [id=1, name=sai mukesh, age=20, salary=50000.0]", student.toString());
	    }
	}

