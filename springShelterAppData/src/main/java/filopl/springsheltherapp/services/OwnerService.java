package filopl.springsheltherapp.services;

import filopl.springsheltherapp.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}