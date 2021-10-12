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
		vo.setPublisher("���빮��");
		vo.setTitle("���̾� ��ȭ���� ����");
		vo.setWriter("�����ó� ���̰�");
		
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
			// �α��� ����
			System.out.println("�α��� ����!");
		}
		else {
			// �α��� ����
			System.out.println("�α��� ����!");
		}
		
		
		
		
		
		factory.close();
		
	}
}
