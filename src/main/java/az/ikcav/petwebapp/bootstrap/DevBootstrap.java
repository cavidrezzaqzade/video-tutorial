package az.ikcav.petwebapp.bootstrap;

import az.ikcav.petwebapp.model.Author;
import az.ikcav.petwebapp.model.Book;
import az.ikcav.petwebapp.repositories.AuthorRepository;
import az.ikcav.petwebapp.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //initData();
    }

    private void initData(){

        //author Cavid
        Author ca = new Author("Cavid", "Razzagzade");
        Book ddd = new Book("Domain Driven Design", "1234", "Donald Trump");

        ca.getBooks().add(ddd);
        ddd.getAuthors().add(ca);

        authorRepository.save(ca);
        bookRepository.save(ddd);


        //author Khayal
        Author kh = new Author("Khayal", "Farzi");
        Book go1984 = new Book("1984GO", "4321", "George Orwell");

        kh.getBooks().add(go1984);
        go1984.getAuthors().add(kh);

        authorRepository.save(kh);
        bookRepository.save(go1984);
    }


}
