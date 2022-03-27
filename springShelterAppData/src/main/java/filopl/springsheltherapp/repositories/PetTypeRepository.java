package filopl.springsheltherapp.repositories;

import filopl.springsheltherapp.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
