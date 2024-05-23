package org.Tw.day05.dimarray;

public class Practice_DimArray3 {
	public static void main(String [] args) {
		//1 6 11 16 21
		//2 7 12 17 22 
		//5씩 증가
		//
		//

		
		int [][] arrs = new int [5][5];
		int k = 1;
		for(int i = 0; i <5; i++) {
			for(int j = 0; j<5 ; j++) {
				arrs[i][j] = k;
				k=k+5;
			}
			k=2+i;
		}
		
		//출력전에 값을 먼저 설정하고 출력코딩할것!
		/*
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + "\t");
				
			}
			System.out.println();
		}
		*/
		for(int [] arr : arrs) {
			for(int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}
}
