package edu.kalum.ws.alumno.core.models.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import edu.kalum.ws.alumno.core.models.entity.Alumno;

@Stateless
public class AlumnoDaoImpl implements AlumnoDao {

    @PersistenceContext(unitName = "KalumPU")
    private EntityManager entityManager;

    @Override
    public List<Alumno> findAllAlumno() {        
        return this.entityManager.createNamedQuery("Alumno.findAll").getResultList();
    }

    @Override
    public Alumno findAlumnoByCarne(String carne) {        
        return this.entityManager.find(Alumno.class, carne);
    }

    @Override
    public void insertAlumno(Alumno alumno) {
        this.entityManager.persist(alumno);
    }

    @Override
    public void updateAlumno(Alumno alumno) {
        this.entityManager.persist(alumno);
    }

    @Override
    public void deleteAlumno(Alumno alumno) {
        this.entityManager.remove(this.entityManager.merge(alumno));
    }
    
}