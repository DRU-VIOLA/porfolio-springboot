
package com.ejemplo.Spring.Boot.services;

import com.ejemplo.Spring.Boot.model.Idiomas;
import java.util.List;

public interface IIdiomas {
   
    
     public List<Idiomas> verIdiomas();
    
    public void crearIdioma (Idiomas idioma);
    
    public void borrarIdioma (Long id);
    
    public Idiomas buscarIdioma (Long id);

    public void editarIdioma (Idiomas idioma);
    
}

    

