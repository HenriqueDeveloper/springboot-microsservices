package br.com.henrique.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.henrique.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}