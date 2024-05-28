package org.Tw.day08.oop.objectarray;

public class Book {
	//제목
	//저자
	public String title;
	public String author;
	
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author =author;
	}
	
	public String toString() {
		return "("+this.title+","+this.author+")";
	}
	
	
	
	
	
//	public String name;
//	public String author;
//	
//	public Book() {}
//	
//	public Book(String name, String author) {
//		this.name = name;
//		this.author = author;
//	}
//	
//	public String getInfo() {
//		String getInfo = "제목 : " + this.name +"\n"+ "저자 :" +  this.author;
//		return getInfo;
//	}
//	
}
