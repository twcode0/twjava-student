package org.Tw.day08.oop.objectarray.student;

import java.util.Scanner;

public class ManageStudent {
	static Student [] students = new Student[3];
	
	public Student [] printInfo() {
		return students;
	}
	
	public void inputInfo(Student [] students) {
		this.students = students;
	}
	
	public static void displayMsg(String msg) {
		System.out.println(msg);
	}
	
	
}
