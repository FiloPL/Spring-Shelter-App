package filopl.springsheltherapp.repositories;

import filopl.springsheltherapp.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long>  {

    Owner findByLastName( String lastName);
}
