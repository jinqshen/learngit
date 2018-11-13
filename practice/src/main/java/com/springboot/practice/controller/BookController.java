package com.springboot.practice.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.practice.entity.Book;
import com.springboot.practice.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Resource
	private BookService bookService;
	/**
	 * 查询所有书籍数据
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<Book> booklist = bookService.findAllBooks();
		mav.addObject("bookList", booklist);
		mav.setViewName("bookList");
		return mav;
	}
	/**
	 * 添加图书
	 * @param book
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Book book) {
		bookService.addBook(book);
		return "redirect:/book/list";
	}
	/**
	 * 根据id删除图书 resful风格
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		bookService.deleteBook(id);
		return "redirect:/book/list";
	}
	
	@RequestMapping("/preUpdate/{id}")
	public ModelAndView preUpdate(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView();
		Book book = bookService.preUpdateById(id);
		mav.addObject("book", book);
		mav.setViewName("preUpdate");
		return mav;
	}
	
	@PostMapping("/update")
	public String update(Book book) {
		bookService.updateBook(book);
		return "redirect:/book/list";
	}
	
	@ResponseBody
	@RequestMapping("/findByName")
	public List<Book> findByName() {
		return bookService.findBookByName("编程");
	}
	
	@ResponseBody
	@RequestMapping("/random")
	public List<Book> randomList() {
		return bookService.randomFind(2);
	}
	
}
