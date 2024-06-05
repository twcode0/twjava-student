package org.Tw.day14.javaapi;

public class Exam_StringBuffer {
	
	public static void main(String[] args) {
		String data1 = "Hello";
		String data2 = " ";
		String data3 = "JAVA";
		//문자열을 연결해보자
//		data1= data1 + data2+ data3;
		// concat()메소드 이용해서 연결
//		data1 = data1.concat(data2).concat(data3);//메소드 체이닝 메소드 뒤에 메소드를 불러서 같이사용가능
		System.out.println("연결된 문자열 : "+ data1);
		//각자 저장된 다른공간을 '연결'한다~
		
		// StringBuffer 이용해서 연결(메모리 절약)
		// 같은공간으로 불러와서 '합침'
		StringBuffer stb = new StringBuffer();
		stb.append(data1).append(data2).append(data3);
		System.out.println("연결된 문자열 : " + stb.toString());
	}
	
}
