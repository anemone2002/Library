package com.LibraryManagementSystem.repository;

import com.LibraryManagementSystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
