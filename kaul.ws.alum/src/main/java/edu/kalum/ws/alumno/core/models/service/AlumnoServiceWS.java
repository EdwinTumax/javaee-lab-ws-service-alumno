package edu.kalum.ws.alumno.core.models.service;

import java.util.List;

import javax.jws.WebService;

import edu.kalum.ws.alumno.core.models.entity.Alumno;

@WebService
public interface AlumnoServiceWS {
    public List<Alumno> findAll();
}