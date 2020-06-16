package com.geekface.gfpetclinic.domain;

import java.time.LocalDate;
import java.util.Set;

public class Pet extends BaseEntity{

    private String name;
    private LocalDate birthDate;
    private Owner owner;
    private PetType type;
    private Set<Visit> visits;
}
