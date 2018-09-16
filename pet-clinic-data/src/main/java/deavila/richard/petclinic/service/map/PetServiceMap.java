package deavila.richard.petclinic.service.map;

import deavila.richard.petclinic.model.Pet;
import deavila.richard.petclinic.service.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
