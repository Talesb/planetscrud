package br.com.infnet.talesb.planets.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.talesb.planets.domain.Planet;

@Repository
public interface PlanetsRepository extends JpaRepository<Planet, Long> {

	
	List<Planet> findAllByName(String name);
	
	
}
