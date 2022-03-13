package filopl.springsheltherapp.services;

import filopl.springsheltherapp.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();

}
