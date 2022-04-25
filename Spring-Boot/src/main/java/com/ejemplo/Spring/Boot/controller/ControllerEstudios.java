
package com.ejemplo.Spring.Boot.controller;


import com.ejemplo.Spring.Boot.model.Estudios;
import com.ejemplo.Spring.Boot.services.IEstudiosService;
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
public class ControllerEstudios {
        
        @Autowired
        private IEstudiosService estudServ;
           
        @PostMapping ("/new/estudio")
        public void agregarEstudio (@RequestBody Estudios estud){
          estudServ.crearEstudio(estud);
        }
        
        @GetMapping ("/ver/estudios")
        @ResponseBody
        public List <Estudios> verEstudios () {
        return estudServ.verEstudios();
        }
        
        @DeleteMapping ("/delete/{id}")
        public void borrarEstudio (@PathVariable Long id){
        estudServ.borrarEstudio(id);}
        
        @PutMapping ("/editar/{id}")
        public void editarEstudio (@PathVariable ("id") Long id, @RequestBody Estudios estud){
                Estudios estudio = estudServ.buscarEstudio(id);
        	estudio.setCarrera(estud.getCarrera());
        	estudio.setAno_inicio(estud.getAno_inicio());
                estudio.setAno_final(estud.getAno_final());
                estudio.setInstitucion(estud.getInstitucion());
        	estudServ.editarEstudio(estud);
              
        }
}
