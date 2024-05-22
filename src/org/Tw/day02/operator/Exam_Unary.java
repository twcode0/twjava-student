package org.Tw.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		단항연산자 
//		a++, ++a -> a = a+1;
		int a1 = 1;
		System.out.println(++a1);
//		전위연산 먼저해버림
		System.out.println(a1++);
//		후위연산 나중에 해버림
		System.out.println(a1);
//		후위연산되어서 3이됨
		//문제1
//		a가 10, b는 20, c는 30입니다.
//		a++;
//		b=(--a) +b;
//		c=(a++) + (--b);
//		a,b,c의 값은 얼마일까요?
		/*10
		b 10+20 30
		a = 9 > 10
		c 10+29 39
		a 11
		11 19 30*/
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a++);
		System.out.println(b=(--a) + b);
		System.out.println(a);
		System.out.println(c=(a++) + (--b));
		System.out.println(a +"," +b + "," +c);
		System.out.println(a);
		//문제2
		//x는 100, y는 33, z는 0
		// x--;
		// z= x-- + --y;
		// x = 99 + x++ + x;
		// y = y-- + y + ++y;
		// x : ?, y: ? z : ?
		
		// z = 100 + 32 132
		// x99 y 32 z 132
		// x= 98 + 99 + 100 =297
		// y = 32+ 32 + 33 
		//y = 94
		// x++ 연산되니까 298 94 132
		//x--; 안해서 >>>296 94 131
		
		int x = 100;
		int y = 33;
		int z = 0;
		x--;
		System.out.println(z= x-- + --y);
		System.out.println(x= 99 + x++ + x);
		System.out.println(y= y-- + y + y++);
		System.out.println(x + "," + y + "," + z);
				
	}

}
