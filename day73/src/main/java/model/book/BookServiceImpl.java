package model.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService{

	
	//JdbcTemplate 사용을 위한 타입 설정 
	@Autowired
	private SpringBookDAO bookDAO;

	@Override
	public List<BookVO> getBookList(BookVO vo) {
		return bookDAO.getBookList(vo);
	}

	@Override
	public void insertBook(BookVO vo) {
		bookDAO.insertBook(vo);
	}
	
	

	
}
