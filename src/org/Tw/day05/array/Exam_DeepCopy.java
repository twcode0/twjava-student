package org.Tw.day05.array;

public class Exam_DeepCopy {
	public static void main(String [] args) {
		// 배열복사 중 깊은 복사
		// 새로운 공간을 생성해서
		// 다른배열을 바라보는것
		// 배열을 따로 수정할 수 있다.
		int [] arrs = {0,1,4,9};
//		int [] copy = arrs; 얕은복사
		int [] copy = new int[4];
		for(int i = 0; i <arrs.length; i++) {
			copy[i] = arrs[i];
		}
		copy[1] = 11;
		for (int i : copy) {
			System.out.print(i + " ");
		}
		for(int i : arrs) {
			System.out.print(i + " ");
		}
	}
}
