package com.webey.basics;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public static final int COURSE_ENROLL_LIMIT = 3;

	// variable declarations
	private static int studentCount;

	private static int idInitializer = 1000;
	private final int id;
	private String name;
	private String gender = "male";
	
	List<Course> enrolledCourses = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getStudentCount() {
		return studentCount;
	}

	// Constructors
	public Student(String name, String gender) {
		this.name = name;
		this.gender = gender;

		id = ++idInitializer;
		studentCount++;
		System.out.println("ID of " + name + " is " + id);
	}

	// method definitions
	public boolean updateProfile(String name) {
		this.name = name;
		return true;
	}

	public String getGender() {
		return this.gender;
	}
	
	public static int getIdInitializer() {
		return idInitializer;
	}

	public int getId() {
		return id;
	}
	
	public void enroll(Course course) {
		if (enrolledCourses.size() < COURSE_ENROLL_LIMIT) {
			enrolledCourses.add(course);
		}		
		printEnrolledCourses();
	}
	
	private void printEnrolledCourses() {
		for (Course course : enrolledCourses) {
			if (course.getDepartment() != null)
				System.out.println("Course: " + course.getName() + ", Department: " + course.getDepartment().getName());	
		}
	}
	
	public List<Course> getEnrolledCourses() {
		return enrolledCourses;
	}
}