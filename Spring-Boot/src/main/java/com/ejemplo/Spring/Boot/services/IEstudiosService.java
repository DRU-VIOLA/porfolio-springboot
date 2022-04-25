
package com.ejemplo.Spring.Boot.services;

import com.ejemplo.Spring.Boot.model.Estudios;
import java.util.List;

public interface IEstudiosService {
    
    public List<Estudios> verEstudios();
    
    public void crearEstudio (Estudios estud);
    
    public void borrarEstudio (Long id);
    
    public Estudios  buscarEstudio (Long id);

    public void editarEstudio (Estudios estud);
}
    