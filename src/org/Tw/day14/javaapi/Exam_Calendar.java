package org.Tw.day14.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
//		System.out.println(today);
		//다 변수에 저장 > 필요할때마다 꺼내서 쓴당
		//private에 저장? get set ?
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.MONTH)+1+"월");//0부터 카운트해서 +1
		System.out.println(today.get(Calendar.DATE)+"일");
		System.out.println(today.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println(today.get(Calendar.DATE)+"일");
		System.out.println(today.get(Calendar.HOUR)+"시");
		System.out.println(today.get(Calendar.MINUTE)+"분");
		System.out.println(today.get(Calendar.SECOND)+"초");
		System.out.println(today.get(Calendar.MILLISECOND));
		System.out.println(today.get(Calendar.AM_PM));// 오전 0 //오후 1
		
		Calendar startDate = Calendar.getInstance();
		printDate("개강한 날은", startDate);
		// 개강한 날은 2024/05/07/화요일(9시)오전9시 00분 0초 0밀f리초
	}
	
	public static void printDate(String title, Calendar date) {
		
	}
}
