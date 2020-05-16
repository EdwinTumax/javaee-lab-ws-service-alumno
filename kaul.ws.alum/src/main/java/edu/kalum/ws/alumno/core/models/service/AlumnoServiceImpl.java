package edu.kalum.ws.alumno.core.models.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import edu.kalum.ws.alumno.core.models.dao.AlumnoDao;
import edu.kalum.ws.alumno.core.models.entity.Alumno;

@Stateless
@WebService(endpointInterface = "edu.kalum.ws.alumno.core.models.service.AlumnoServiceWS")
public class AlumnoServiceImpl implements AlumnoService, AlumnoServiceWS {

    @Inject
    private AlumnoDao alumnoDao;

    @Override
    public List<Alumno> findAll() {        
        return this.alumnoDao.findAllAlumno();
    }

    @Override
    public Alumno findByCarne(String carne) {
        return this.alumnoDao.findAlumnoByCarne(carne);
    }

    @Override
    public void add(Alumno alumno) {
        this.alumnoDao.insertAlumno(alumno);
    }

    @Override
    public void update(Alumno alumno) {
        this.alumnoDao.updateAlumno(alumno);
    }

    @Override
    public void delete(Alumno alumno) {
        this.alumnoDao.deleteAlumno(alumno);
    }
    
}