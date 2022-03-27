package filopl.springsheltherapp.repositories;

import filopl.springsheltherapp.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
