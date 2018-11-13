package com.springboot.practice.service;

import java.util.List;

import com.springboot.practice.entity.Book;

/**
 * BookService接口
 * @author jinqshen
 *
 */
public interface BookService {

	public List<Book> findAllBooks();
	
	public void addBook(Book book);
	
	public void deleteBook(Integer id);
	
	public Book preUpdateById(Integer id);
	
	public void updateBook(Book book);
	
	public List<Book> findBookByName(String name);
	
	public List<Book> randomFind(Integer i);
}
