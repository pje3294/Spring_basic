package model.book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


class BookRowMapper implements RowMapper<BookVO>{

	@Override
	public BookVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookVO data = new BookVO();
		data.setId(rs.getInt("id"));
		data.setPdate(rs.getDate("pdate"));
		data.setPublisher(rs.getString("publisher"));
		data.setTitle(rs.getString("title"));
		data.setWriter(rs.getString("writer"));
		
		return data;
	}
}


@Repository()
public class SpringBookDAO {
	//  board -> 1.검색 getBoardList 2.입력 insertBoard
	
	private final String selectAllSQL = "SELECT * FROM book where title LIKE '%'||?||'%'";

	private final String insertSQL = "INSERT INTO book (id, title, writer,publisher) VALUES ((SELECT NVL(MAX(ID),0)+1 FROM book),?,?,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public List<BookVO> getBookList(BookVO vo) {
		System.out.println("jdbcTemplate으로 getBookList");
		Object[] args= {vo.getTitle()};
		return jdbcTemplate.query(selectAllSQL, args, new BookRowMapper());
	}

	public void insertBook(BookVO vo) {
		System.out.println("jdbcTemplate으로 insertBook");
		jdbcTemplate.update(insertSQL, vo.getTitle(), vo.getWriter(), vo.getPublisher());
	}
	
	
	
	
	
}
