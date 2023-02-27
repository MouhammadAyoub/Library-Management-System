package mylibrary.Models;

import java.util.HashMap;

public class BookFactory {

    private static final HashMap books = new HashMap();

    public static Book getBook(String category) {
        Book book = (Book) books.get(category);
        if (book == null) {
            book = new Book(category);
            books.put(category, book);

        }

        return book;
    }
}
