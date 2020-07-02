package com.geekface.gfpetclinic.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "pet_type")
public class PetType extends BaseEntity{

    @Column(name = "description")
    private String description;
}
