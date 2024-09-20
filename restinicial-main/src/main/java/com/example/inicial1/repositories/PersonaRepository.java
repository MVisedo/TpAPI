package com.example.inicial1.repositories;

import com.example.inicial1.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


@org.springframework.stereotype.Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}