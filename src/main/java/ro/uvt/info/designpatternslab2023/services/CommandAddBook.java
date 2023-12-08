package ro.uvt.info.designpatternslab2023.services;
import ro.uvt.info.designpatternslab2023.classes.Book;

public class CommandAddBook implements Command<Book> {
    private BookServices books;

    private Book newBook;

    @Override
    public Book execute() {
        return books.createBook(newBook);
    }

    public CommandAddBook(BookServices contextbooks){
        this.books = contextbooks;
    }

    public void setAtribute(Book newBook){
        this.newBook = newBook;
    }
}