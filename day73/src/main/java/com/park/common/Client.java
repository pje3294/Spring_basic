package com.park.common;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import model.book.BookService;
import model.book.BookVO;
import model.member.MemberService;
import model.member.MemberVO;

public class Client {
	public static void main(String[] args) {

		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		BookService bs = (BookService)factory.getBean("bookService");
		
		BookVO vo = new BookVO();
		/*vo.setId(1432);
		vo.setPublisher("현대문학");
		vo.setTitle("나미야 잡화점의 기적");
		vo.setWriter("히가시노 게이고");
		
		bs.insertBook(vo);*/
		
		
		vo.setTitle("");
		
		List<BookVO> datas = bs.getBookList(vo);
		for(BookVO data : datas) {
			System.out.println(data);
		}
		
		System.out.println("\n---------------------\n");
		
		MemberService ms=(MemberService)factory.getBean("memberService");

		MemberVO vo2=new MemberVO();
		vo2.setId("id");
		vo2.setPassword("p");
		MemberVO data=ms.getMember(vo2);

		if(data!=null) {
			// 로그인 성공
			System.out.println("로그인 성공!");
		}
		else {
			// 로그인 실패
			System.out.println("로그인 실패!");
		}
		
		
		
		
		
		factory.close();
		
	}
}
