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
	private double temp;
	private String planetType;

	public Planet(Long id, String name, double temp, String planetType) {
		super();
		this.id = id;
		this.name = name;
		this.temp = temp;
		this.planetType = planetType;
	}

	public Planet(PlanetDTO dto) {
		super();
		this.id = dto.getId();
		this.name = dto.getName();
		this.temp = dto.getTemp();
		this.planetType = dto.getPlanetType();
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

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public String getPlanetType() {
		return planetType;
	}

	public void setPlanetType(String planetType) {
		this.planetType = planetType;
	}

	public PlanetDTO toDTO() {
		PlanetDTO dto = new PlanetDTO();
		dto.setId(id);
		dto.setName(name);
		dto.setTemp(temp);
		dto.setPlanetType(planetType);
		return dto;
	}

}
