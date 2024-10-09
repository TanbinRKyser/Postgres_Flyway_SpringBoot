package net.tusker.spring_boot_flyway_migration.repositories;


import net.tusker.spring_boot_flyway_migration.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
