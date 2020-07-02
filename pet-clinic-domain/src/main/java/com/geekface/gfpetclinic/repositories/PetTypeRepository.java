package com.geekface.gfpetclinic.repositories;

import com.geekface.gfpetclinic.domain.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
