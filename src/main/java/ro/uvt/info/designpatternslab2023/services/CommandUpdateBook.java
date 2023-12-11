package ro.uvt.info.designpatternslab2023.services;

import ro.uvt.info.designpatternslab2023.classes.Book;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandUpdateBook implements Command {

    private final Long id;
    private final Book book; //copie
    Book result;

    @Override
    public void execute(CommandContext context) {
        result = context.getBookRepository().createBook(book);
    }

    public Book getResults() {
        return result;
    }
}