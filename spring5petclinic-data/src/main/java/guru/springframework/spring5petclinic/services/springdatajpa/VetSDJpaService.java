package guru.springframework.spring5petclinic.services.springdatajpa;

import guru.springframework.spring5petclinic.model.Vet;
import guru.springframework.spring5petclinic.repositories.SpecialityRepository;
import guru.springframework.spring5petclinic.repositories.VetRepository;
import guru.springframework.spring5petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;
    private final SpecialityRepository specialityRepository;

    public VetSDJpaService(VetRepository vetRepository, SpecialityRepository specialityRepository) {
        this.vetRepository = vetRepository;
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Vet> findall() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long id) {
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
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
