package org.Tw.day05.array;

public class Exam_HallowCopy {

	public static void main(String[] args) {
		// 배열의 복사 중 얕은 복사
		// 같은 배열을 바라봄
		// 배열내부 수정시 둘 다 바뀜
		int [] arrs = new int[4];
		for(int i = 0; i< arrs.length; i++) {
			arrs[i] = i*i;
		}
		//for-each문
		//원래
		//for(int i =0; i <arrs.length; i++){}
	
		
		int [] copy = arrs; // 배열 얕은 복사
		copy[1]=11;			// 두번째 값 변겅
		for(int i : arrs) {
			System.out.print(i+" "); // 0 1 4 9 (x)
									 // 0 11 4 9
		}
		for(int i : copy) {
			System.out.print(i+" "); // 0 11 4 9
		}
		
	}

}
