
package com.ejemplo.Spring.Boot.services;


import com.ejemplo.Spring.Boot.model.Estudios;
import com.ejemplo.Spring.Boot.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiosService implements IEstudiosService {
    
    @Autowired
    public EstudiosRepository estudRepo;
    
    @Override
    public List<Estudios> verEstudios() {
    return estudRepo.findAll();
    }
    @Override
    public void crearEstudio(Estudios estud) {
       estudRepo.save(estud);
    }

    @Override
    public void borrarEstudio(Long id) {
    estudRepo.deleteById(id);
    }

    @Override
    public Estudios buscarEstudio(Long id) {
       return estudRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarEstudio(Estudios estud) {
    estudRepo.save(estud);
    }
}


