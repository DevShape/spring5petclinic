package guru.springframework.spring5petclinic.services.map;

import guru.springframework.spring5petclinic.model.Pet;
import guru.springframework.spring5petclinic.services.PetService;

import java.util.Set;

public class PerServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findall() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}