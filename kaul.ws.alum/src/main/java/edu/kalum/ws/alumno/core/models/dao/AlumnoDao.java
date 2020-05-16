package edu.kalum.ws.alumno.core.models.dao;

import java.util.List;
import edu.kalum.ws.alumno.core.models.entity.Alumno;

public interface AlumnoDao {
    public List<Alumno> findAllAlumno();
    public Alumno findAlumnoByCarne(String carne);
    public void insertAlumno(Alumno alumno);
    public void updateAlumno(Alumno alumno);
    public void deleteAlumno(Alumno alumno);
}