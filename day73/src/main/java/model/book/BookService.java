package model.book;

import java.util.List;

//   board -> 1.�˻� getBoardList 2.�Է� insertBoard

public interface BookService {

	List<BookVO> getBookList(BookVO vo);

	void insertBook(BookVO vo);

}
