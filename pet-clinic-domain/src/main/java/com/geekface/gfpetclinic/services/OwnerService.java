package com.geekface.gfpetclinic.services;

import com.geekface.gfpetclinic.domain.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
