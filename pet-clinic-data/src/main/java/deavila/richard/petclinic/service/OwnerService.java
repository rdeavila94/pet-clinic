package deavila.richard.petclinic.service;

import deavila.richard.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
