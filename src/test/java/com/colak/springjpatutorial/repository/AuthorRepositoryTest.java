package com.colak.springjpatutorial.repository;

import com.colak.springjpatutorial.jpa.Author;
import com.colak.springjpatutorial.jpa.Book;
import com.colak.springjpatutorial.projection.AuthorProjection;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@Slf4j
class AuthorRepositoryTest {

    @Autowired
    private AuthorRepository repository;


    @Test
    void findByIdWithBooks() {
        List<AuthorProjection> list = repository.findAllProjectedBy();
        for (AuthorProjection authorProjection : list) {
            log.info("Id : {} , Name : {}", authorProjection.getId(), authorProjection.getName());
        }
    }
}
