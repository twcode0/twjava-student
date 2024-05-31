package org.Tw.day11.oop.member;

import java.util.Scanner;

public class ViewMember {


	private Member member;

	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원관리 프로그램 ======");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 회원 전체정보 조회");
		System.out.println("4. 회원정보수정");
		System.out.println("5. 회원정보삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int input = sc.nextInt();
		return input;
	}

	public void displayMessage(String msg) {
		System.out.println(msg);
	}

	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원가입 ======");
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		System.out.print("주소 : " );
		String memberAddress = sc.nextLine();
		Member member = new Member(memberName, memberEmail, memberPhone, memberAddress);
//		member.setMemberName(memberName);
//		member.setMemberEmail(memberEmail);
//		member.setMemberPhone(memberPhone);
//		member.setMemberAddress(memberAddress);
		return member;
	}

	public String inputEmail(String category) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(category +"할 이메일 입력 :");
		String email =sc.next();
		return email;
	}

	public void modifyMember(Member member) {
		//memberEmail = email;
		
	}

	public void printAllMembers(Member[] members) {
		System.out.println("====== 회원 전체정보 출력 ======");
		for(Member member : members) {
			if(member != null) {
				System.out.println(member.toString());
			}
		}
	}

	public void printOneMember(Member member) {
		// TODO Auto-generated method stub
		System.out.println("====== 회원 검색 결과 ======");
		System.out.println("이름 : " + member.getMemberName());
		System.out.println("전화번호 : " + member.getMemberPhone());
		System.out.println("주소 : " + member.getMemberAddress());
		System.out.println("이메일 : " + member.getMemberEmail());
		
	}

	public Member modifyMember1(Member member) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원가입 ======");
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		System.out.print("주소 : " );
		String memberAddress = sc.nextLine();
		member.setMemberName(memberName);
		member.setMemberEmail(memberAddress);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		Member member1 = new Member(memberName,null,memberPhone, memberAddress);
		return member1;
	}

	public Member modifyMember() {
		// TODO Auto-generated method stub
		return null;
	}


//	public String modifyInput() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수정할  이메일 입력 : ");
////		String email = sc.next();
//		
//		return sc.next();
//	}
	
	

}
