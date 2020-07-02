package com.geekface.gfpetclinic.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType type;

    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
    private Set<Visit> visits = new HashSet<>();

    @Builder
    public Pet(Long id, String name, LocalDate birthDate, @NonNull Owner owner,
               @NonNull PetType type, @NonNull Set<Visit> visits) {
        super(id);
        this.name = name;
        this.birthDate = birthDate;
        this.owner = owner;
        this.type = type;
        this.visits = visits;
    }
}
