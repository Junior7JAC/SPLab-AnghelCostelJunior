package ro.uvt.info.designpatternslab2023.services;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandDeleteBook implements Command {

    private final Long id;

    public void execute(CommandContext context) {
        context.getBookRepository().deleteBook(id);
    }
}