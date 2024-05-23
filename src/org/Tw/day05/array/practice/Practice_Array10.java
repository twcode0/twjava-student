package org.Tw.day05.array.practice;

import java.util.Scanner;

public class Practice_Array10 {
	public static void main(String [] args) {
		//주민등록번호입력시
		// 뒷자리 첫 자리 이후 *표시로출력
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum =sc.next();
		char []idNums = new char[idNum.length()]; 
		for(int i = 0; i < idNums.length; i++) {
			idNums[i] = idNum.charAt(i);
		}
		char [] copy = new char[idNums.length]; // 123456-1234567 원본저장
		for(int i = 0; i < idNums.length; i++) {
			//copy[i] = idNums[i];
			if(i<8) {				// 123456-1*******
				copy[i] = idNums[i];
			}else {
				copy[i] = '*';
			}
		}
		for(char num : copy) {
			System.out.print(num);
		}
	}

}
