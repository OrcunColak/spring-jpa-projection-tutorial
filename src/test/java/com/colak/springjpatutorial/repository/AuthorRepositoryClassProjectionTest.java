package com.colak.springjpatutorial.repository;

import com.colak.springjpatutorial.projection.AuthorClassProjection;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class AuthorRepositoryClassProjectionTest {

    @Autowired
    private AuthorRepository repository;


    @Test
    void findAllProjectedBy2() {
        List<AuthorClassProjection> list = repository.findAllProjectedBy2();
        for (AuthorClassProjection authorClassProjection : list) {
            log.info("Id : {} , Name : {}", authorClassProjection.id(), authorClassProjection.name());
        }
    }

    @Test
    void findAllProjectedByAge() {
        List<AuthorClassProjection> list = repository.findAllProjectedByAge(1);
        for (AuthorClassProjection authorClassProjection : list) {
            log.info("Id : {} , Name : {}", authorClassProjection.id(), authorClassProjection.name());
        }
    }

    @Test
    void findAllProjectedByName() {
        List<AuthorClassProjection> list = repository.findAllProjectedByName("Author 1");
        for (AuthorClassProjection authorClassProjection : list) {
            log.info("Id : {} , Name : {}", authorClassProjection.id(), authorClassProjection.name());
        }
    }
}
