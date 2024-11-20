# Read me

The original idea is from  
https://medium.com/@ak123aryan/effective-use-of-projection-in-spring-data-jpa-b90234d524af

Spring Data JPA projections provide a way to shape query results into custom views or DTOs (Data Transfer Objects)
without fetching the entire entity from the database. This selective retrieval of data can significantly enhance
performance, especially when dealing with entities containing a large number of fields or complex relationships.

There are two types of projection

1. Interface based projection
   Create an interface with getter methods corresponding to the fields you want to include in the query result.

2. Class/record based projection