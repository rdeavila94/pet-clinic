package deavila.richard.petclinic.bootstrap;

import deavila.richard.petclinic.model.Owner;
import deavila.richard.petclinic.model.Vet;
import deavila.richard.petclinic.service.OwnerService;
import deavila.richard.petclinic.service.VetService;
import deavila.richard.petclinic.service.map.OwnerServiceMap;
import deavila.richard.petclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;

    private final OwnerService ownerService;

    public DataLoader() {
        this.vetService = new VetServiceMap();
        this.ownerService = new OwnerServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        init();
    }

    public void init() {
        Owner owner = new Owner();
        owner.setFirstName("Richard");
        owner.setLastName("DeAvila");
        owner.setId(1L);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ricky");
        owner2.setLastName("Dees");
        owner2.setId(2L);

        Vet vet = new Vet();
        vet.setFirstName("Jonh");
        vet.setLastName("Smith");
        vet.setId(1L);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jame");
        vet2.setLastName("Doe");
        vet2.setId(2L);

        ownerService.save(owner);
        ownerService.save(owner2);

        vetService.save(vet);
        vetService.save(vet2);
    }
}
