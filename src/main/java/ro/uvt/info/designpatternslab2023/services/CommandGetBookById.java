package ro.uvt.info.designpatternslab2023.services;
import ro.uvt.info.designpatternslab2023.classes.Book;
public class CommandGetBookById implements Command<Book> {
    private BookServices books;
    private Long id;

    @Override
    public Book execute() {
        return books.getBookById(id);
    }

    public CommandGetBookById(BookServices contextBooks)
    {
        this.books = contextBooks;
    }

    public void setId(Long id) {
        this.id = id;
    }
}