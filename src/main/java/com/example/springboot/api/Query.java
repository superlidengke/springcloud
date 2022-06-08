package com.example.springboot.api;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

	public Book book() {
		Book book =  new Book();
		book.setId("1");
		book.setName("Test");
		book.setPageCount(200);
		Author author = new Author();
		author.setFirstName("Tom");
		author.setLastName("Yang");
		author.setId("1");
		book.setAuthor(author);
		return book;
	}

}