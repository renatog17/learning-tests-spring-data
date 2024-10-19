package com.renato.springdata.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.springdata.domain.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long>{

	List<Carro> findByModelo(String modelo);
}
