package org.Tw.day05.dimarray;

public class Practice_DimArray4 {
	public static void main(String[] args) {
		//1 2 3 4 5 - 열 증가
		//10 9 8 7 6 - 열 감소
		//11 12 13 14 15 - 열 증가
		// 20 19 18 17 16 - 열 감소
		// 21 22 23 24 25 - 열 증가
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			if(i%2==0) {
				for(int j=0; i < 5; j++) {
				arrs[i][j] = k++;
			}
			}else {
				for(int j =4; j>=0; j--) {
					arrs[i][j] = k++;
				}
			
			}
		
		}
		for(int []arr : arrs) {
			for(int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
		
	}
}