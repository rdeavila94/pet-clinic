package deavila.richard.petclinic.service.map;

import deavila.richard.petclinic.model.Owner;
import deavila.richard.petclinic.service.OwnerService;


public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    //TODO
    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
