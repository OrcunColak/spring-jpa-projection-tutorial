package com.colak.springjpatutorial.projection;

import java.io.Serializable;


// Example for class/record based projection
// See https://stackoverflow.com/questions/78784503/how-to-cache-the-view-result-of-a-spring-jpa-query
// to see why record is Serializable
public record AuthorClassProjection(Long id, String name) implements Serializable {
}
