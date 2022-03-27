package filopl.springsheltherapp.services.springdatajpa;

import filopl.springsheltherapp.model.Owner;
import filopl.springsheltherapp.model.Vet;
import filopl.springsheltherapp.repositories.VetRepository;
import filopl.springsheltherapp.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);

        return vets;
    }

    @Override
    public Vet findByID(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        vetRepository.deleteById(id);
    }
}
