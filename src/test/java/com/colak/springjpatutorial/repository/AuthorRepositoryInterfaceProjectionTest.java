package com.colak.springjpatutorial.repository;

import com.colak.springjpatutorial.projection.AuthorProjection;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class AuthorRepositoryInterfaceProjectionTest {

    @Autowired
    private AuthorRepository repository;


    @Test
    void findAllProjectedBy() {
        List<AuthorProjection> list = repository.findAllProjectedBy();
        for (AuthorProjection authorProjection : list) {
            log.info("Id : {} , Name : {}", authorProjection.getId(), authorProjection.getAuthorName());
        }
    }
}
