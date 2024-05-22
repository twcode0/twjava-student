package org.Tw.day02.operator;

public class Quiz {
	public static void main (String [] args) {
		int a =5;
		int b = 10;
		int c = (++a) + b;
		// c = 6 + 10 = 16
		int d= c/a;
		// d= 16/6 = 2.xxx = 2
		int e = c%a;
		// e=16%6= 4
		int f= e++;
		//e = 5
		int g = (--b) + (d--);
		// g = 9 + 2 = 11 // d=1
		int h = 2;
		int i = a++ + b / (--c/f) *  (g-- - d) % (++e + h);
		// 6 + 9 / (15/5) * (11-1) % (6) 
		// a=7 b=9 c= 15 d = e=6
	}
}
