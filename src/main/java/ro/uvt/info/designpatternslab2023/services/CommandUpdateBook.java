package ro.uvt.info.designpatternslab2023.services;

import ro.uvt.info.designpatternslab2023.classes.Book;

public class CommandUpdateBook implements Command<Book>{

    private BookServices books;
    private Book newBook;
    private Long id;

    @Override
    public Book execute() {
        books.updateBook(id,newBook);
        return books.getBookById(id);
    }
    public CommandUpdateBook(BookServices contextBooks){
        this.books = contextBooks;
    }

    public void setAtribute(Long id, Book newBook){
        this.id = id;
        this.newBook = newBook;
    }

}