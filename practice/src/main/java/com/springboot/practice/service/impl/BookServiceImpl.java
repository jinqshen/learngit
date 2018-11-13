package com.springboot.practice.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springboot.practice.dao.BookDao;
import com.springboot.practice.entity.Book;
import com.springboot.practice.service.BookService;
/**
 * 
 * @author jinqshen
 *
 */
@Service
public class BookServiceImpl implements BookService {

	@Resource
	private BookDao bookDao;
	
	@Override
	public List<Book> findAllBooks() {
		return bookDao.findAll();
	}

	@Override
	public void addBook(Book book) {
		bookDao.save(book);
	}

	@Override
	public void deleteBook(Integer id) {
		bookDao.deleteById(id);
	}
	
	@Override
	public Book preUpdateById(Integer id) {
		return bookDao.getOne(id);
	}

	@Override
	public void updateBook(Book book) {
		bookDao.save(book);
	}

	@Override
	public List<Book> findBookByName(String name) {
		return bookDao.findBookByName(name);
		
	}

	@Override
	public List<Book> randomFind(Integer i) {
		return bookDao.randomFind(i);
	}

}
