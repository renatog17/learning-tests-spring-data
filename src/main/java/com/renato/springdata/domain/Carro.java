package com.renato.springdata.domain;

import com.renato.springdata.controller.dto.CreateCarroDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String modelo;
	private String marca;
	private String quilometrosRodados;

	public Carro() {
		
	}
	
	public Carro(String modelo, String marca, String quilometrosRodados) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.quilometrosRodados = quilometrosRodados;
	}

	public Carro(CreateCarroDTO createCarroDTO) {
		this.modelo = createCarroDTO.modelo();
		this.marca = createCarroDTO.marca();
		this.quilometrosRodados = createCarroDTO.quilometrosRodados();
	}

}
