package model.member;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

class MemberRowMapper implements RowMapper<MemberVO>{

	@Override
	public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		MemberVO data = new MemberVO();
		data.setId(rs.getString("id"));
		data.setName(rs.getNString("name"));
		data.setPassword(rs.getString("password"));
		data.setRole(rs.getString("role"));
		return data;
	}
	
}

@Repository()
public class SpringMemberDAO {
// member -> 1.입력(회원가입) insertMember 2.로그인 getMember
	
	private final String selectOneSQL = "SELECT * FROM member WHERE id=? AND password=?";

	private final String insertSQL = "INSERT INTO member (id,password,name,role) VALUES(?,?,?,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public MemberVO getMember(MemberVO vo) {
		System.out.println("jdbcTemplate으로 getMember");
		Object[] args = {vo.getId(), vo.getPassword()};
		return jdbcTemplate.queryForObject(selectOneSQL, args, new MemberRowMapper());
	}
	
	
	public void insertMember(MemberVO vo) {
		System.out.println("jdbcTemplate으로 insertMember");
		jdbcTemplate.update(insertSQL,vo.getId(), vo.getPassword(), vo.getName(), vo.getRole());
	}
	
	
	
}
