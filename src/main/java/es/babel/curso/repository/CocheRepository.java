package es.babel.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.babel.curso.entity.Coche;

public interface CocheRepository extends JpaRepository<Coche, Integer> {

}
