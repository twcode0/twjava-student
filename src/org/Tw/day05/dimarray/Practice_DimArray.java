package org.Tw.day05.dimarray;

public class Practice_DimArray {
	public static void main(String [] args) {
		//5 4 3 2 1
		//10 9 8 7 6 5
		//15 14 13 12 11
		//20 19 18 17 16
		//25 24 23 22 21

		
		int [][] arrs = new int [5][5];
		int k = 1;
		// 정방향 출력
		// 이걸 반대로하려면?
		for(int i = 0; i <5; i++) {
			for(int j = 4; j >=0 ; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		
		//출력전에 값을 먼저 설정하고 출력코딩할것!
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + "\t");
				
			}
			System.out.println();
		}
	}
}
