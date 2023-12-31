package com.uce.edu.sistema.vehicular.repository;

import java.util.List;

import com.uce.edu.sistema.vehicular.repository.modelo.Matricula;

public interface IMatriculaRep {

	public Matricula seleccionar(String codigo);

	public void insertar(Matricula matricula);

	public void actualizar(Matricula matricula);

	public void eliminar(String codigo);
	
	public List<Matricula> reporte();


}
