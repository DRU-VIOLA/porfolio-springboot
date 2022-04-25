
package com.ejemplo.Spring.Boot.repository;

import com.ejemplo.Spring.Boot.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {

    public void save(Long id);
    
}
