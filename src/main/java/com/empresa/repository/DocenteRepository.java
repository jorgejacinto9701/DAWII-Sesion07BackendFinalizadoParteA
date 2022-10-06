package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Integer> {

	@Query("select e from Docente e where (e.nombre like ?1) and (?2 is '' or e.dni = ?2) and (?3 is -1 or e.ubigeo.idUbigeo = ?3) ")      
	public abstract List<Docente> listaDocente(String nombre, String dni, int idUbigeo);
	
}


