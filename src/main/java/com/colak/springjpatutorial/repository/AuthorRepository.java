package com.colak.springjpatutorial.repository;

import com.colak.springjpatutorial.jpa.Author;
import com.colak.springjpatutorial.projection.AuthorProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    List<AuthorProjection> findAllProjectedBy();

}
