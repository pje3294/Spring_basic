package model.book;

import java.util.List;

//   board -> 1.검색 getBoardList 2.입력 insertBoard

public interface BookService {

	List<BookVO> getBookList(BookVO vo);

	void insertBook(BookVO vo);

}
