package model.book;

import java.sql.Date;

public class BookVO {
	private int id;
	private String title;
	private String writer;
	private String publisher;
	private Date pdate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	@Override
	public String toString() {
		return "BookVO [id=" + id + ", title=" + title + ", writer=" + writer + ", publisher=" + publisher + ", pdate="
				+ pdate + "]";
	}

}
