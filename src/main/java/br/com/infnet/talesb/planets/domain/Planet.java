package br.com.infnet.talesb.planets.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.infnet.talesb.planets.domain.dto.PlanetDTO;

@Entity
public class Planet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double temperatura;
	private String tipoPlaneta;
	
	
	public Planet(Long id, String name, double temperatura, String tipoPlaneta) {
		super();
		this.id = id;
		this.name = name;
		this.temperatura = temperatura;
		this.tipoPlaneta = tipoPlaneta;
	}
	
	public Planet(PlanetDTO dto) {
		super();
		this.id = dto.getId();
		this.name = dto.getName();
		this.temperatura = dto.getTemperatura();
		this.tipoPlaneta = dto.getTipoPlaneta();
	}

	
	public Planet() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public String getTipoPlaneta() {
		return tipoPlaneta;
	}

	public void setTipoPlaneta(String tipoPlaneta) {
		this.tipoPlaneta = tipoPlaneta;
	}

	public PlanetDTO toDTO() {
		PlanetDTO dto = new PlanetDTO();
		dto.setId(id);
		dto.setName(name);
		dto.setTemperatura(temperatura);
		dto.setTipoPlaneta(tipoPlaneta);
		return dto;
	}
	
	
	 

}
