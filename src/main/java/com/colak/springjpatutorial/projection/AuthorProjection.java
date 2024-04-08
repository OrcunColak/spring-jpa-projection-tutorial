package com.colak.springjpatutorial.projection;

import org.springframework.beans.factory.annotation.Value;

/**
 * Example for interface based projection
 */
public interface AuthorProjection {
    Long getId();

    // Spring Expression Language for projection example
    // See https://ishansoninitj.medium.com/views-materialized-views-and-spring-data-jpa-05faeb8c0c67
    // In the target the column is "name" but in the projections it has become authorName
    @Value("#{target.name}")
    String getAuthorName();
}
