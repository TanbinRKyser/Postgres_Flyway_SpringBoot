package net.tusker.spring_boot_flyway_migration;

import net.tusker.spring_boot_flyway_migration.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFlywayMigrationApplication implements CommandLineRunner {

    private final BookRepository bookRepository;

    public SpringBootFlywayMigrationApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFlywayMigrationApplication.class, args);
    }

    @Override
    public void run(String... args) {
        bookRepository.findAll().forEach( book -> System.out.println(book.toString()) );
    }
}
