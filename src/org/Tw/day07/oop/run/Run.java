package org.Tw.day07.oop.run;

import java.util.Scanner;

import org.Tw.day07.oop.Book;
import org.Tw.day07.oop.Circle;
import org.Tw.day07.oop.Member;
import org.Tw.day07.oop.exercise.Rectangle;

//실행용 클래스

public class Run {

	public static void main(String[] args) {
//		Run ex = new Run(); // static을 같이 입력하면 쓸 필요가 없음
//		ex.oopPractice1();
		Run.oopPractice1();
		Math.random();
	}
	
	public void constructorEx() {
		// 생성자 예제 연습
//		Book book = new Book(); // 기본생성자 이용해서 객체 생성
//								// title, author는 모두 비어있음
//		book.title = "춘향뎐";
//		book.author = "작자미상";
		Book book = new Book("춘향뎐", "작자미상");
		Book emptyBook = new Book();
		
		Circle bintz = new Circle();
		bintz.setRadius(10);
		
		
	} 
	
	public static void oopPractice1() {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		System.out.println(">>");
		
		int result = rect.getArea();
		System.out.println("사각형의 넓이는 " + result + "입니다.");
	}
	
	public static void oopExercise() {
		// 예제1.
		// Circle의 instance를 이용하여
		// 이름 달덩이, 반지름은 5인
		// Circle의 넓이를 출력해보세요.
		Circle circle = new Circle();
		circle.name = "달덩이";
		circle.radius = 5;
		double area = circle.getArea();
		System.out.println(circle.getArea());
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "던킨도넛";
		area = donut.getArea();
		System.out.println(area);
	}
	
	public static void memberPractice() {
		Scanner scanner = new Scanner(System.in);
		Member member1 = new Member();
		member1.name = "일용자";
		member1.age = 33;
		member1.job ="의사";
		Member member2 = new Member();
		member2.name = "이용자";
		member2.age = 22;
		
		System.out.println(member1.name);
		System.out.println(member1.job);
		System.out.println(member1.age);
		System.out.println(member2.name);
		System.out.println(member2.job);
	}

}






















