package com.colak.springjpatutorial.repository;

import com.colak.springjpatutorial.jpa.Author;
import com.colak.springjpatutorial.projection.AuthorClassProjection;
import com.colak.springjpatutorial.projection.AuthorProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    // Example for interface based projection
    List<AuthorProjection> findAllProjectedBy();

    // Example for class/record based projection
    @Query("SELECT NEW com.colak.springjpatutorial.projection.AuthorClassProjection(a.id, a.name) FROM Author a")
    List<AuthorClassProjection> findAllProjectedBy2();

    @Query("SELECT NEW com.colak.springjpatutorial.projection.AuthorClassProjection(a.id, a.name) FROM Author a where a.id > :minId")
    List<AuthorClassProjection> findAllProjectedByAge(@Param("minId") int minId);

}
