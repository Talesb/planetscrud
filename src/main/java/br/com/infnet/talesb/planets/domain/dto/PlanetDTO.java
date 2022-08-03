package br.com.infnet.talesb.planets.domain.dto;

public class PlanetDTO {

	private Long id;
	private String name;
	private double temp;
	private String planetType;

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
 
	
	
	

}
