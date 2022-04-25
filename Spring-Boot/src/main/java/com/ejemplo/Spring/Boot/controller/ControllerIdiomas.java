
package com.ejemplo.Spring.Boot.controller;


import com.ejemplo.Spring.Boot.model.Idiomas;
import com.ejemplo.Spring.Boot.services.IIdiomas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerIdiomas {
             
   @Autowired  
        private IIdiomas idiomaServ;
           
        @PostMapping ("/new/idioma")
        public void agregarIdioma (@RequestBody Idiomas idi){
          idiomaServ.crearIdioma(idi);
        }
        
        @GetMapping ("/ver/idioma")
        @ResponseBody
        public List<Idiomas> verIdiomas () {
        return idiomaServ.verIdiomas();
        }
        
        @DeleteMapping ("/delete/{id}")
        public void borrarIdioma(@PathVariable Long id){
        idiomaServ.borrarIdioma(id);}
        
        @PutMapping ("/editar/{id}")
        public void editarIdioma(@PathVariable ("id") Long id, @RequestBody Idiomas idi){
                Idiomas idioma= idiomaServ.buscarIdioma(id);
        	idioma.setIdioma(idi.getIdioma());
                idioma.setNivel(idi.getNivel());
        	idiomaServ.editarIdioma(idi);
             
}
        
}