package com.geekface.gfpetclinic.repositories;

import com.geekface.gfpetclinic.domain.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
