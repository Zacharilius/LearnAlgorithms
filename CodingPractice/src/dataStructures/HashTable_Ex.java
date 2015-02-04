package dataStructures;

import java.util.HashMap;
import java.util.Map;
import sampleCode.Student;

public class HashTable_Ex {

	public static void main(String[] args) {
		Student[] students = {
			new Student(10000, "Hannah", "Beansley"),
			new Student(10001, "Joe", "Schmo"),
			new Student(10002, "Tim", "Johnson"), 
			new Student(10003, "Summer", "Hanson"), 
			new Student(10004, "Norbert", "Thompson"),
		};
		HashMap<Integer, Student> map = buildMap(students);
	}
	public static HashMap<Integer, Student> buildMap(Student[] students){
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		for(Student s: students) map.put(s.getId(), s);
		return map;
	}

}
