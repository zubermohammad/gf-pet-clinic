package com.geekface.gfpetclinic.services.mapimpl;

import com.geekface.gfpetclinic.domain.Owner;
import com.geekface.gfpetclinic.services.CrudService;
import com.geekface.gfpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner findByLastName(String lastName) throws Exception{
        return map.values()
                .stream()
                .filter(owner -> owner.getLastName().equals(lastName))
                .findFirst()
                .orElseThrow(()->new Exception("Owner by Last Name: "+ lastName +" not found"));
    }
}
