package br.com.henrique.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.henrique.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {

	Cambio findByFromAndTo(String from, String to);
	
}