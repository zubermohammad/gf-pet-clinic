package com.geekface.gfpetclinic.repositories;

import com.geekface.gfpetclinic.domain.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
