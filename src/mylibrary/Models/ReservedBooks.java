package mylibrary.Models;

public class ReservedBooks {

    Book book;
    int copies;

    Book getBook() {
        return book;
    }

    int getCopies() {
        return copies;
    }

    void setCopies(int copies) {
        this.copies = copies;
    }

    void setBook(Book book) {
        this.book = book;
    }

}
