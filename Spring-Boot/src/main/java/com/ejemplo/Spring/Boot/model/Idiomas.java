package com.ejemplo.Spring.Boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Idiomas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String idioma;
    private String nivel;
 
    public Idiomas(){
    }
    
    public Idiomas (Long id, String idioma, String nivel) {
    this.id= id;
    this.idioma= idioma;
    this.nivel= nivel;
    }
}
