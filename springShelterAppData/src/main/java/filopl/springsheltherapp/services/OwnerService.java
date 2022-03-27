package filopl.springsheltherapp.services;

import filopl.springsheltherapp.model.Owner;

/**
 * Created by T.Filo Zegarlicki on 27.03.2022
 **/

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}