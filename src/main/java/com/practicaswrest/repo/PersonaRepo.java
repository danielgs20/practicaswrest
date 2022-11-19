/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practicaswrest.repo;

import com.practicaswrest.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jeferson.agudelo
 */
@Repository
public interface PersonaRepo extends JpaRepository<Persona, Integer>{
    
}
