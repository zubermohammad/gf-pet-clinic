package com.geekface.gfpetclinic.domain;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;

    public BaseEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
