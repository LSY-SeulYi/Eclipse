package fx_madang;
// DB의 Book Table과 메핑되게 만든다.
public class Book {

	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 콤보박스에 반영시킬 정보
	@Override
	public String toString() {
		return bookname +"("+ publisher + ")";
	}
	// 히스토리에 반영시킬 정보
	public String toString2() {
		return bookid + "," + bookname +"," + publisher +"," + price;
	}
	
}
