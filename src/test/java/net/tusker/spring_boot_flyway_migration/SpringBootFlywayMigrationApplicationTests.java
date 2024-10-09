package net.tusker.spring_boot_flyway_migration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SpringBootFlywayMigrationApplicationTests {

    @Test
    void contextLoads() {
    }

}
