package org.Tw.day05.exception.exercise;

import java.util.Scanner;

public class Exercise_Exception1 {
	public static void main(String[] args) {
		//문제 1
		//정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를
		//출력하고 다시 입력받는 프로그램을 작성하여라.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int result =0;
			int num1=0, num2=0;
			try {
				System.out.println("정수를 입력해 주세요 : ");
				 num1 = sc.nextInt();
				 num2 = sc.nextInt();
				result=num1/num2;
			}catch(ArithmeticException e){
				System.out.println("0으로 나눌 수 없습니다.");
				continue;
			}
			System.out.printf("%d을 %d로 나누면 몫은 %d입니다.\n", num1,num2,result);
		}
		
		
	}

}
