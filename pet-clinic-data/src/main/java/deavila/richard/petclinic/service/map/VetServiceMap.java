package deavila.richard.petclinic.service.map;

import deavila.richard.petclinic.model.Vet;
import deavila.richard.petclinic.service.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
