package model.member;

import java.util.List;


//member -> 1.입력(회원가입) insertMember 2.로그인 getMember
public interface MemberService {

	void insertMember(MemberVO vo);

	MemberVO getMember(MemberVO vo);

}
