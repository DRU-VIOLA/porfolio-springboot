package com.ejemplo.Spring.Boot.services;

import com.ejemplo.Spring.Boot.model.Idiomas;
import com.ejemplo.Spring.Boot.repository.IdiomasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomasService implements IIdiomas {
    
    @Autowired
    public IdiomasRepository idiomaRepo;
    
    @Override
    public List<Idiomas> verIdiomas() {
    return idiomaRepo.findAll();
    }
    
    @Override
    public void crearIdioma(Idiomas idioma) {
       idiomaRepo.save(idioma);
    }

    @Override
    public void borrarIdioma(Long id) {
    idiomaRepo.deleteById(id);
    }

    @Override
    public Idiomas buscarIdioma(Long id) {
       return idiomaRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarIdioma(Idiomas idioma) {
    idiomaRepo.save(idioma);
    }
    
    
}
