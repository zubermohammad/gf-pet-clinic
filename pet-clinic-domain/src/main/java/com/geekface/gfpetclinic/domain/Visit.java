package com.geekface.gfpetclinic.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @Builder
    public Visit(Long id, LocalDate date, String description, @NonNull Pet pet) {
        super(id);
        this.date = date;
        this.description = description;
        this.pet = pet;
    }
}
