package model.member;

import java.util.List;


//member -> 1.�Է�(ȸ������) insertMember 2.�α��� getMember
public interface MemberService {

	void insertMember(MemberVO vo);

	MemberVO getMember(MemberVO vo);

}
