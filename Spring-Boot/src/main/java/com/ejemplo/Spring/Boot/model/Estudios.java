
package com.ejemplo.Spring.Boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Estudios {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;
       
        private String carrera;
        private int ano_inicio;
        private int ano_final;
        private String institucion;
        
        public Estudios (){
        }
        
        public Estudios (Long id, String carrera, int ano_inicio, int ano_final, String institucion){
            this.id= id;
            this.carrera= carrera;
            this.ano_inicio=ano_inicio;
            this.ano_final= ano_final;
            this.institucion = institucion;
        }
}

