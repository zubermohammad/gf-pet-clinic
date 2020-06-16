package com.geekface.gfpetclinic.services;

import com.geekface.gfpetclinic.domain.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
