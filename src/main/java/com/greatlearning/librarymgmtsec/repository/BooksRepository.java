package com.greatlearning.librarymgmtsec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.librarymgmtsec.entity.Book;

public interface BooksRepository extends JpaRepository<Book, Integer>{
	//Customized Query through MethodName Signature or Using @Query annotation.
	List<Book> findByNameContainsAndAuthorContainsAllIgnoreCase(String name,String author);
}
