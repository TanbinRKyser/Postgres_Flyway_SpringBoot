package net.tusker.spring_boot_flyway_migration;

import org.springframework.boot.SpringApplication;

public class TestSpringBootFlywayMigrationApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringBootFlywayMigrationApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
