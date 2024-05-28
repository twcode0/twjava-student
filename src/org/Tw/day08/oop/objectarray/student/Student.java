package org.Tw.day08.oop.objectarray.student;

public class Student {
	String name;
	int score1;
	int score2;
	
	public Student() {}
	
	public Student(String name, int score1, int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	public String toString() {
		return this.name + "학생의 첫번째 점수는 " + this.score1 + "두번째 점수는"
				+score2+"점 입니다.";
	}
}
