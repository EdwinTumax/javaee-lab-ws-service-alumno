package edu.kalum.ws.alumno.core.models.service;

import java.util.List;

import edu.kalum.ws.alumno.core.models.entity.Alumno;

public interface AlumnoService {
   public List<Alumno> findAll(); 
   public Alumno findByCarne(String carne);
   public void add(Alumno alumno);
   public void update(Alumno alumno);
   public void delete(Alumno alumno);
}