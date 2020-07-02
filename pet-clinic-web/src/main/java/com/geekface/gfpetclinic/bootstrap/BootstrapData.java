package com.geekface.gfpetclinic.bootstrap;

import com.geekface.gfpetclinic.domain.Owner;
import com.geekface.gfpetclinic.domain.Vet;
import com.geekface.gfpetclinic.services.OwnerService;
import com.geekface.gfpetclinic.services.PetService;
import com.geekface.gfpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class BootstrapData implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;

    public BootstrapData(OwnerService ownerService, PetService petService, VetService vetService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner zuber = new Owner();
        zuber.setFirstName("Zuber");
        zuber.setLastName("MOhammed");
        ownerService.save(zuber);

        Owner robert = Owner.builder().firstName("Robert")
                .lastName("Martin")
                .address("5th Privet Drive")
                .city("London")
                .pets(new HashSet<>())
                .build();
        ownerService.save(robert);

        Owner jim = new Owner();
        jim.setFirstName("Jim");
        jim.setLastName("Carry");
        ownerService.save(jim);

        System.out.println("Owners created: " + ownerService.findAll());

        Vet jill = new Vet();
        jill.setFirstName("Jill");
        jill.setLastName("Jones");
        vetService.save(jill);

        Vet jamy = new Vet();
        jamy.setFirstName("Jamy");
        jamy.setLastName("Ford");
        vetService.save(jamy);

        System.out.println("Vet created: " + vetService.findAll().size());

    }
}
