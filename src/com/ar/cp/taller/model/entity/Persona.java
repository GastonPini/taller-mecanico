package com.ar.cp.taller.model.entity;
// Generated 19/07/2021 17:46:47 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Persona generated by hbm2java
 */
@Entity
@Table(name="persona"
    ,schema="public"
)
public class Persona  implements java.io.Serializable {


     private int id;
     private String dni;
     private String nombre;
     private String apellido;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Persona() {
    }

	
    public Persona(int id, String apellido) {
        this.id = id;
        this.apellido = apellido;
    }
    public Persona(int id, String dni, String nombre, String apellido, Set<Usuario> usuarios) {
       this.id = id;
       this.dni = dni;
       this.nombre = nombre;
       this.apellido = apellido;
       this.usuarios = usuarios;
    }
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="dni", length=50)
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    
    @Column(name="nombre", length=100)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="apellido", nullable=false, length=100)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}


