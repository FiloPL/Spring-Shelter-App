package filopl.springsheltherapp.services.map;

import filopl.springsheltherapp.model.Pet;
import filopl.springsheltherapp.model.PetType;
import filopl.springsheltherapp.services.PetService;
import filopl.springsheltherapp.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findByID(Long id) {
        return super.findByID(id);
    }
}