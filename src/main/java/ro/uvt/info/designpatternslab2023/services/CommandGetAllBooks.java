package ro.uvt.info.designpatternslab2023.services;
import ro.uvt.info.designpatternslab2023.classes.Book;

import java.util.List;

public class CommandGetAllBooks implements Command<List<Book>>{
    private BookServices books;

    public List<Book> execute() {
        return books.getBooks();
    }
    public CommandGetAllBooks(BookServices contextBooks){
        this.books=contextBooks;
    }

}