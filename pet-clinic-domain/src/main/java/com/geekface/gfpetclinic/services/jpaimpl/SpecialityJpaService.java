package com.geekface.gfpetclinic.services.jpaimpl;

import com.geekface.gfpetclinic.domain.Speciality;
import com.geekface.gfpetclinic.repositories.SpecitlityRepository;
import com.geekface.gfpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class SpecialityJpaService implements SpecialityService {

    private final SpecitlityRepository specitlityRepository;

    public SpecialityJpaService(SpecitlityRepository specitlityRepository) {
        this.specitlityRepository = specitlityRepository;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specitlityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return specitlityRepository.save(speciality);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specitlityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public void deleteById(Long id) {
        specitlityRepository.deleteById(id);
    }

    @Override
    public void delete(Speciality speciality) {
        specitlityRepository.delete(speciality);
    }
}
