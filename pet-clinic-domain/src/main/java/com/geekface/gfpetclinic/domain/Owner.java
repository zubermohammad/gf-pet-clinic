package com.geekface.gfpetclinic.domain;

import java.util.Set;

public class Owner extends Person{

    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;

    @Override
    public String toString() {
        return "Owner{" +
                "id='" + getId() +'\'' +
                ", firstName='" + getFirstName() +'\'' +
                ", lastName='" + getLastName() +'\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
