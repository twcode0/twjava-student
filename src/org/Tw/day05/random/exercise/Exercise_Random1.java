package org.Tw.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String[] args) {
		//동전 앞 뒤 맞추기!
		// ==동전 앞뒤 맞추기 ====
		// 숫자를 입력해 주세요 (1. 앞면/ 2.뒷면) : 1
		// 맞췄습니다.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print(" 숫자를 입력해 주세요 (1. 앞면/ 2.뒷면) : ");
		
		while(true) {
			int computer = (int)(Math.random()*2)+1;
			System.out.println(computer);//답이 노출됨
			int choice = sc.nextInt();
			if(choice == -1) break;
			
			if (computer == choice) {
				System.out.println("맞췄습니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
			
		}
		
		
	}
}
