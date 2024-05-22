package org.Tw.day02.operator;

public class Quiz_Logical {
	public static void main(String [] args) {
		int a = 50;
		int b = 30;
		boolean result1, result2, result3, result4;
		// boolean 은 = 붙이지 않고 선언한다.
		result1 = (a != b) && (a<b);
		result2 = (a<b) || (a==b); 
		result3 = (a>b) && (a!=b);
		result4 = (a>b) || (a==b);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		int c = 70;
		int d = 55;
		boolean result5, result6, result7, result8;
		result5 = (c==d)||(c++<100);
		result6 = (c<d) && (--d<55);
		result7 = (c!=d) && (d--<c++);
		result8 = (c++ != b) || (d++ >= 85);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}

}
