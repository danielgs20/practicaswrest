/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaswrest.Controler;

import com.practicaswrest.entity.Persona;
import com.practicaswrest.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jeferson.agudelo
 */

@RestController
@RequestMapping("/personas")
public class PersonaControler {
    
    @Autowired
    private PersonaService personaservice;
    
    @GetMapping
    public List<Persona> listar(){
        return personaservice.listar();
    } 
    
    @PostMapping
    public Persona insertar(@RequestBody Persona per){
        return personaservice.insertar(per);
    }
    
    @PutMapping
    public Persona actualizar(@RequestBody Persona per){
        return personaservice.actualizar(per);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Persona per){
        personaservice.eliminar(per);
    }
    
}
