/*
--If a method return type is class that means that method will return current object then that type of method is known as Factory Method
  public class Sample
{   
    public Sample getSampleObject()
    {
    
       return new Sample(); //to return this value we depend on Sample class default constr
 }
 */

class Book {
	private String author;
	private String title;
	private double price;

	public Book(String author, String title, double price) {
		this.author = author;
		this.title = title;
		this.price = price;
	}

	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", price=" + price + "]";
	}

	// Static Factory Method
	public static Book getBookObject() {
		Book b1 = new Book("James", "Java", 1200);
		return b1;
	}

}

// BookDemo.java
// --------------

public class BookDemo {

	public static void main(String[] args) {
		Book book = Book.getBookObject();
		System.out.println(book);
	}

}
