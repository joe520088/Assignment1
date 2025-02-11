package BookClass;


public class BookClass {
	
	private String title;
	private String author;
	private String ISBN;
	private Double price;
	
	// default construct
	public BookClass()
	{
		this.title ="Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	// construct to take in value 
	public BookClass(String title, String author, String ISBN, Double price)
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	// copy constructor
	public BookClass(BookClass book)
	{
		this.title = book.title;
		this.author = book.author;
		this.ISBN = book.ISBN;
		this.price = book.price;
	}
	
	@Override
	public boolean equals(Object other)
	{
		BookClass book = (BookClass) other;
		if(this == other)
		{
			return true;
		}
		
		return this.ISBN.equals(book.ISBN);
	}
	
	@Override
	public String toString()
	{
		return "BookClass [title =" + title +  ", author = " + author + ", ISBN = " + ISBN + ", Price = " + price +"]";
		
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
