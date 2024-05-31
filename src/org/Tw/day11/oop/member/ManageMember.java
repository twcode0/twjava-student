package org.Tw.day11.oop.member;

public class ManageMember {

	Member [] members;
	int index;
	
	// 필드 초기화를 생성자에서
	public ManageMember() {
		members = new Member[5];
		index = 0;
	}
	
	//회원정보저장
	public void insertMember(Member member) {
		if(index < members.length) {
			members[index] = member;
			index++;
		}
	}

	// 회원전체정보
	public Member[] getAllMembers() {
		// TODO Auto-generated method stub
		return members;
	}
	//이메일로 회원 검색
	public Member searchOnebyEmail(String email) {
		for(Member member: members) {
			if(member != null && email.equals(member.getMemberEmail())) {
				return member;
			}
		}
		return null;
	}

	public void deleteAllMembers() {
		// 다지우는건 비우는것, 배열을 비운다.
		// 어떻게 비울까? 배열을 비운다 ~
		members = new Member[5];
		index = 0;
//		for(Member member : members) {
//			member = null;
//		}
		
	}

	public void updateMember(Member member) {
		int i = 0;
		for(Member mOrigin : members) {
			if(mOrigin != null) {
				String memberEmail = mOrigin.getMemberEmail();
				if(	memberEmail.equals(member.getMemberEmail())) {
//					mOrigin.setMemberAddress(member.getMemberAddress());
//					mOrigin.setMemberName(member.getMemberName());
//					mOrigin.setMemberPhone(member.getMemberPhone());
					members[i] = member;
			}
			}
			i++;
		}
	}


}
