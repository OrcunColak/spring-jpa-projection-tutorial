package com.colak.springjpatutorial.projection;

import java.io.Serializable;

/**
 * Example for class/record based projection
 */
public record AuthorClassProjection(Long id, String name) implements Serializable {
}
