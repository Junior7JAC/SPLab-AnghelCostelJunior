package ro.uvt.info.designpatternslab2023.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import ro.uvt.info.designpatternslab2023.persistence.AuthorRepository;
import ro.uvt.info.designpatternslab2023.persistence.BooksRepository;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)

public class CommandContext {

    @Getter
    final private BooksRepository bookRepository;

    @Getter
    final private AuthorRepository authorRepository;
}