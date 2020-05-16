package edu.kalum.ws.alumno.core.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="alumno")
@NamedQueries({@NamedQuery(name = "Alumno.findAll", query = "select a from Alumno a")})
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Alumno implements Serializable {
    @Id
    @Column(name="carne")
    private String carne;
    @Column(name = "no_expediente")
    private String noExpediente;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "email")
    private String email;
    private static final long serialVersionUID = 1L;
}