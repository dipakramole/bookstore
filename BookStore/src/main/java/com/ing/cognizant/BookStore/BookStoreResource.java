package com.ing.cognizant.BookStore;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ing.cognizant.BookStore.module.Book;

@Path("/books")
public class BookStoreResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getAllAvailableBooks(){
		List<Book>  books = new ArrayList<Book>();
		books.add(new Book("Java1","Dipak1",5001d));
		books.add(new Book("Java2","Dipak2",5002d));
		books.add(new Book("Java3","Dipak3",5003d));
		books.add(new Book("Java4","Dipak4",5004d));
		
		return books;
	}
	
}
