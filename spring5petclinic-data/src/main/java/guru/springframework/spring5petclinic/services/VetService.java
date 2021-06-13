package guru.springframework.spring5petclinic.services;

import guru.springframework.spring5petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
