package org.Tw.day14.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat trans = new SimpleDateFormat("yyy/MM/dd HH:mm:ss"); // 년/월/일 시:분:초
		SimpleDateFormat trans2 = new SimpleDateFormat("yyy/MM/dd HH:mm:ss:SS"); // 년/월/일 시:분:초
		String transDate1 = trans.format(date);
		System.out.println("형식 변환1 : " + transDate1);
		String transDate2 = trans2.format(date);
		System.out.println("형식 변환2 : " + transDate2);
		
		//====================권장사항==========================
		Calendar calender = new GregorianCalendar();
		System.out.println(calender.getTime());
		String changed =trans.format(calender.getTime());
		System.out.println("그레고리안 달력 날짜 변환 : " + changed);
	}
}
