package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		
List<Student> students = new ArrayList<Student>();
Student std = new Student();
std.setName("Viji");
students.add(std);
  List<String> names = students.stream().map(Student::getName).filter(name->name.startsWith("V"))
  .collect(Collectors.toList());
  System.out.println(names);
		
		
	}

}
class Student{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
