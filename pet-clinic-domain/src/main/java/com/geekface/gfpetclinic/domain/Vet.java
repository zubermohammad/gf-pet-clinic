package com.geekface.gfpetclinic.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany
    @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities;

    @Builder
    public Vet(Long id, String firstName, String lastName, @NonNull Set<Speciality> specialities) {
        super(id, firstName, lastName);
        this.specialities = specialities;
    }
}
