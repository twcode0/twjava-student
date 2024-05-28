package org.Tw.day08.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {

	public static void main(String[] args) {
		//여러개의 책이 존재하는데 그 책의 정보를 여러개 저장하려고함.
		//책은 3권까지 저장할수 있도록 하고 제목과 저자만 입력하는
		// 프로그램을 작성하시오
		// 제목 어린왕자
		// 저자 쌩떽쥐페리
		// 제목 츈향뎐
		// 저자 작자미상
		// (어린왕자, 쌩떽쥐페리)
		// (춘향뎐, 작자미상)
		Book [] books = new Book[3];
		Scanner sc = new Scanner(System.in);
		// 객체 배열 입력
		for (int i = 0; i < books.length; i++) {
			System.out.print(">> ");
			String title = sc.nextLine();
			System.out.print(">> ");
			String author = sc.nextLine();
			books[i]= new Book(title, author);
		}
		//객체 배열 출력
		for(Book book : books) {
			System.out.println(book.toString());
		}
		
//		Book prince = new Book("어린왕자", "썡뗵취페리");
////		System.out.println(prince.getInfo()); 배열에 잘 들어갔는지 확인
//		Book chun = new Book("춘향뎐", "작자미상");
////		System.out.println(chun.getInfo()); // 배열에 잘 들어갔는지 확인
//		
//		bArrs[0] = prince;
//		bArrs[1] = chun;
//		System.out.println(bArrs[0].getInfo());
//		System.out.println(bArrs[1].getInfo());
	}
}
