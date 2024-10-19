package com.renato.springdata.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renato.springdata.controller.dto.CreateCarroDTO;
import com.renato.springdata.controller.dto.ReadCarroDTO;
import com.renato.springdata.domain.Carro;
import com.renato.springdata.repositories.CarroRepository;

@RequestMapping("/carros")
@RestController
public class CarroController {

	private final CarroRepository carroRepository;
	
	public CarroController(CarroRepository carroRepository) {
		this.carroRepository = carroRepository;
	}

	@PostMapping
	@Transactional
	public ResponseEntity<?> postCarro(CreateCarroDTO createCarroDTO){
		Carro carro = new Carro(createCarroDTO);
		carroRepository.save(carro);
		return null;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getCarro(@PathVariable Long id){
		Carro carro = carroRepository.getReferenceById(id);
		List<Carro> findByModelo = carroRepository.findByModelo("celta");
		
		System.out.println(findByModelo.size());
		return null;
	}
	
}
