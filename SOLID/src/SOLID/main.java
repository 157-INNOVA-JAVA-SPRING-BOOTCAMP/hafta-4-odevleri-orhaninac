package SOLID;

import SOLID.SingleResponsibility.Book;
import SOLID.SingleResponsibility.BookPrinter;

public class main {

	public static void main(String[] args) {
		Book book=new Book("kitap1","orhan","text1");
		BookPrinter bookPrinter=new BookPrinter();
		
		bookPrinter.printTextToConsole(book.getAuthor());
	}

}
