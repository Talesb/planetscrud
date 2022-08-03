package br.com.infnet.talesb.planets.domain.dto;

public class PlanetDTO {

	private Long id;
	private String name;
	private double temperatura;
	private String tipoPlaneta;

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

}
