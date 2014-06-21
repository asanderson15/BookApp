package com.biggerdeep.books.client;

import java.util.List;

import com.biggerdeep.books.dao.*;
import com.biggerdeep.books.model.Book;

public class BookApp {

	private static BookDAO bookDao = new BookDAOImpl();
	
	public static void main(String[] args) {
		// List all books
		System.err.println("Listing all Books:");
		findAllBooks();
		System.err.println();
		
		// Search book by keyword
		System.err.println("Search book by keyword in book title: Groovy:");
		searchBooks("Groovy");
		System.err.println();
		
		System.err.println("Search book by keyword in Author's name: Josh:");
		searchBooks("Josh");

	}
	
	private static void findAllBooks() {
		List<Book> books = bookDao.findAllBooks();
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	private static void searchBooks(String keyWord) {
		List<Book> books = bookDao.searchBooksByKeyword(keyWord);
		for (Book book : books) {
			System.out.println(book);
		}
	}

}
