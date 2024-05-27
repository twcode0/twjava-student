package org.Tw.day05.dimarray;

public class Dim_Array {
	public void Practice_DimArray() {
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

	public void Practice_DimArray2() {
		int arrs [][] = new int [5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j =4; j>=0; j--) {
				arrs[j][i] = k++;
			}
			
		}
		for(int arr [] : arrs) {
			for(int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}
	
	public void Practice_DimArray3() {
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
	
	public void Practice_DimArray4() {
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
	
	public void Exam_DimArray() {
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
