
package com.ejemplo.Spring.Boot.repository;

import com.ejemplo.Spring.Boot.model.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiosRepository extends JpaRepository <Estudios , Long>{
    public void save(Long id);
}




