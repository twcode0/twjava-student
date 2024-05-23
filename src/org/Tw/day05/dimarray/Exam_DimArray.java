package org.Tw.day05.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
		int num = 0;
		int [] nums = new int[10]; // 배열
		int [][] dimNums = new int [2][5]; //2차원 배열
		
		System.out.println("행의 길이 : " + dimNums.length); 
		System.out.println("행의 길이 : " + dimNums[0].length);
		
		int [][] arrs = new int [4][4];//4행 4열 배열 생성
		int k = 1; //배열안에 변수 선언
		//변수 어떻게 변화할지
		for(int i = 0; i <arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		//값이 1씩 증가하는 4,4 2차원배열 출력
		//for출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] +  " ");
			}
			System.out.println();
		}
		
		//for - each로 출력
		for(int [] arr: arrs) {
			for(int j : arr) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
