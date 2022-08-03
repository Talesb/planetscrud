package br.com.infnet.talesb.planets.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.talesb.planets.domain.Planet;
import br.com.infnet.talesb.planets.domain.dto.PlanetDTO;
import br.com.infnet.talesb.planets.repository.PlanetsRepository;

@Service
public class PlanetsService {

	@Autowired
	private PlanetsRepository planetRepository;

	public List<PlanetDTO> getAll() {
		return this.planetRepository.findAll().stream().map(planet -> planet.toDTO()).collect(Collectors.toList());
	}

	public PlanetDTO getById(Long id) {
		Optional<Planet> planet = this.planetRepository.findById(id);
		if (planet.isPresent()) {
			return planet.get().toDTO();
		} else {
			return null;
		}
	}

	public List<PlanetDTO> getAllByName(String name) {
		return this.planetRepository.findAllByName(name).stream().map(planet -> planet.toDTO())
				.collect(Collectors.toList());
	}

	public void update(PlanetDTO planetDTO) {
		this.planetRepository.save(new Planet(planetDTO));
	}

	public void save(PlanetDTO planetDTO) {
		this.planetRepository.save(new Planet(planetDTO));
	}

	public void delete(Long id) {
		this.planetRepository.deleteById(id);
	}

}
