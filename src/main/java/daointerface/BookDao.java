

package daointerface;
import java.util.List;
import model.Books;

public interface BookDao {

	List <Books> getAllBooks();
	Books getBooksByIsbn(int isbn);
	void saveBook(Books book);
	void deleteBook (Books book);

}
