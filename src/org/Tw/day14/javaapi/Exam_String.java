package org.Tw.day14.javaapi;

public class Exam_String {

	public static void main(String[] args) {
		String msg = "Hello java";		//상수풀에 들어가서 재사용
		msg = new String("Hello java"); // 주소 무조건 새롭게 생성
		
		//문자열 길이 length
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		System.out.println(data1 + "의 길이는" + data1.length()) ;
		System.out.println(data2 + "의 길이는" + data2.length()) ;
		
		//문자열 포함되어 있는지 체크 contains
		System.out.println("#이 있는가 : " + data1.contains("#"));
		// contains( " ") 안에 값이 포함되어있으면 참 거짓 판별해줌 
		
		//문자열 연결 concat
		// C#,C++ (공백도 함께)
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 :" + data1);
		
		// 문자열 공백 제거 trim
		data1 = data1.trim(); 
		System.out.println("공백 제거 확인 : " + data1);
		
		// 문자열 교체 C# -> JAVA
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 확인 : " + data1);
		
		// 문자열 썰기1 - 기준 잡고 썰어줌
		String [] words = data1.split(",");
		for(String word : words) {
			System.out.print(word + "/");
		}
		// for(int i = 0; i< words.length; i++){
		//	System.out.print(words[i]+" / ");
		//	}
		System.out.println();
		// 문자열 썰기2 - 인덱스로 썰어줌
		data1 = data1.substring(4); // 4번부터 끝까지 자르기
		System.out.println("문자열 자르기 : "+ data1);
		data1 = data1.substring(0,4); // 
		System.out.println("문자열 자르기 : " + data1);
		
		// 문자열 -> 문자로 만들기
		char word = data1.charAt(0);
		System.out.println("문자로 자르기 : " + word);
	}
}
