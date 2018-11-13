package com.springboot.practice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.practice.entity.Book;

public interface BookDao extends JpaRepository<Book, Integer> {

	@Query(value = "select * from book where name like %?1%", nativeQuery = true)
	public List<Book> findBookByName(String name);
	
	@Query(value = "select * from book order by RAND() limit ?1", nativeQuery = true)
	public List<Book> randomFind(Integer i);
}
