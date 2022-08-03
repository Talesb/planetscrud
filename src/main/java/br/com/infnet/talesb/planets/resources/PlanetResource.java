package br.com.infnet.talesb.planets.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.talesb.planets.domain.dto.PlanetDTO;
import br.com.infnet.talesb.planets.service.PlanetsService;

@RestController
@RequestMapping("/api/planets")
public class PlanetResource {

	@Autowired
	private PlanetsService planetService;

	@GetMapping
	public List<PlanetDTO> getAll() {
		return this.planetService.getAll();
	}

	@GetMapping(value = "/{id}")
	public PlanetDTO getById(@PathVariable("id") long id) {
		return this.planetService.getById(id);
	}

	@PostMapping
	public void save(@RequestBody PlanetDTO planetDTO) {
		this.planetService.save(planetDTO);
	}

	@PutMapping
	public void update(@RequestBody PlanetDTO planetDTO) {
		this.planetService.save(planetDTO);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") long id) {
		this.planetService.delete(id);
	}

}
