package org.Tw.day07.oop.run;

public class Suit {
	
	public static void main(String[]args) {
		Suit s =new Suit(100);
	}
	
	int size;
	String brand;
	int price;
	
	public Suit(int size) {
		this(size, "Hazzys"); // 18줄 호출
		System.out.println("Suit(int)호출");
	}
	public Suit(int size, String brand) {
		 this(size, brand, 100000); // 23줄 호출
		 // 29번째 줄 출력 후 20번째 줄 완료
		 System.out.println("Suit(int,String)호출");
	 }
	public Suit(int size, String brand, int price) {
		 this.size = size;
		 this.brand=brand;
		 this.price=price;
		 System.out.println("Suit(int,String,int)호출");
	 }
	

	
}
