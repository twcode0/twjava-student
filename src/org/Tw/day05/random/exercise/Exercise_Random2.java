package org.Tw.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random2 {
	public static void main (String [] args) {
		//====가위바위보 게임=====
		// 숫자를 선택하세여(1.가위/2.바위/3.보 : )
		// ===결과 =====
		//당신은 가위를 냈습니다.
		//컴퓨터는 보를 냈습니다.
		//====== ======
		//당신이이겼습니다
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("숫자를 선택하세요 (1.가위 / 2. 바위 / 3. 보) : ");
		int choice = sc.nextInt();
		
	}
}
