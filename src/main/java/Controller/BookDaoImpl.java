

package Controller;
import java.util.List;
import java.util.ArrayList;
import daointerface.BookDao;
import model.Books;

public class BookDaoImpl implements BookDao{

private ArrayList <Books> booksObj;

public BookDaoImpl() {
	booksObj = new ArrayList <Books>();
	booksObj.add(new Books(1, "Twilight"));
	booksObj.add(new Books(2, "1984"));
	booksObj.add(new Books(3, "The Giver"));
}

@Override
public List<Books> getAllBooks(){
	return this.booksObj;
}

public Books getBookByIsbn(int isbn) {
	return this.booksObj.get(isbn);
}

@Override
public void saveBook(Books book) {
	this.booksObj.add(book);
}

@Override
public void deleteBook(Books book) {
	this.booksObj.remove(book);
}

@Override
public Books getBooksByIsbn(int isbn) {
	// TODO Auto-generated method stub
	return null;
}

}
