package com.geekface.gfpetclinic.services;

import com.geekface.gfpetclinic.domain.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
