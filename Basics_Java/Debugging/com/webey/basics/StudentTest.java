package com.webey.basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testEnroll() {
		// Test to ensure that student is not allowed to enroll in more than the
		// limit

		// Setting input
		Student student = new Student("anita", "female");
		Course course1 = new Course(1, "Java In-Depth", null);

		// Method execution
		student.enroll(course1);

		// Test output
		assertTrue("Enrollment limit exceeded. Should never happen. Debug!!",
				student.getEnrolledCourses().size() <= Student.COURSE_ENROLL_LIMIT);

		Course course2 = new Course(1, "Algorithms", "CS");
		student.enroll(course2);
		assertTrue("Enrollment limit exceeded. Should never happen. Debug!!",
				student.getEnrolledCourses().size() <= Student.COURSE_ENROLL_LIMIT);

		Course course3 = new Course(1, "Data Structures", "CS");
		student.enroll(course3);
		assertTrue("Enrollment limit exceeded. Should never happen. Debug!!",
				student.getEnrolledCourses().size() <= Student.COURSE_ENROLL_LIMIT);

		Course course4 = new Course(1, "Operating Systems", "CS");
		student.enroll(course4);
		assertTrue("Enrollment limit exceeded. Should never happen. Debug!!",
				student.getEnrolledCourses().size() <= Student.COURSE_ENROLL_LIMIT);

		// assertEquals(3, student.getEnrolledCourses().size());
	}

}