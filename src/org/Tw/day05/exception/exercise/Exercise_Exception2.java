package org.Tw.day05.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception2 {
	public static void main(String[] args) {
		// 문제2
		// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라
		// 사용자가 정수가 아닌 문자를 입력할 대 발생하는
		//InputMismatchException 예외를 처리하여 다시 입력받도록 하여라.
		// 정수 3개를 입력하세요.
		// 11 2 3
		//합은 16
		Scanner sc = new Scanner(System.in);
		//while true 다시 공부해라!
		while(true) {
			int sum =0;
			int num1=0, num2=0, num3=0;
			try {
//				for(int i=0; i<3; i++ {
//				sum += sc.nextInt();
			
//				} 
//				
				System.out.print("3개의 정수를 입력해주세요 : ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				num3 = sc.nextInt();
				sum = num1+num2+num3;
			}catch(InputMismatchException e) {
//				e.printStackTrace();
				System.out.println("정수를 입력해 주세요.");
				sc.next();
//				i--; //중요 ****
				continue;
				//continue 도 몰랑
			}
			System.out.printf("합은 %d 입니다.\n", sum);
		}
		
		
		
	}
}
