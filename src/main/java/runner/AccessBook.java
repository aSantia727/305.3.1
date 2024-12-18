

package runner;
import daointerface.BookDao;
import model.Books;
import java.util.ArrayList;

import Controller.BookDaoImpl;

public class AccessBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----show list of all books-----");
		BookDao bookdao = new BookDaoImpl();
		for(Books b : bookdao.getAllBooks()) {
			System.out.println("Book ISBN : " + b.getIsbn() + " and Book Name : " + b.getBookName());
		}

		System.out.println("-----After added / inserted new book-----");	
		Books b1 = new Books(0, null);
		b1.setIsbn(4);
		b1.setBookName("The Big Short");
		bookdao.saveBook(b1);
		
		for (Books b : bookdao.getAllBooks()) {
			System.out.println("Book ISBN : " + b.getIsbn() + " and Book Name : " + b.getBookName());
		}
		
		System.out.println("Update Book name");
		Books bookupdate = bookdao.getAllBooks().get(1);
		bookupdate.setBookName("Moneyball");
		
		for (Books b : bookdao.getAllBooks()) {
			System.out.println("Book ISBN : " + b.getIsbn() + " and Book Name : " + b.getBookName());
		}
	}

}
