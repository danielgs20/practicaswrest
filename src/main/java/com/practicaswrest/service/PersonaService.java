/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaswrest.service;

import com.practicaswrest.entity.Persona;
import com.practicaswrest.repo.PersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jeferson.agudelo
 */

@Service
public class PersonaService{
    
    
    @Autowired
    private PersonaRepo personarepo;
    
    
    public Persona insertar(Persona per){
        return personarepo.save(per);
    }
    
    public Persona actualizar(Persona per){
        return personarepo.save(per);
    }
    
    public List<Persona> listar(){
        return personarepo.findAll();
    }
    
    public void eliminar(Persona per){
        personarepo.delete(per);
    }
    
    
}
