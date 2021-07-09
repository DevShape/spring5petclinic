package guru.springframework.spring5petclinic.services.map;

import guru.springframework.spring5petclinic.model.Visit;
import guru.springframework.spring5petclinic.services.PetService;
import guru.springframework.spring5petclinic.services.PetTypeService;
import guru.springframework.spring5petclinic.services.VisitService;

import java.util.Set;

public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public VisitMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Visit> findall() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
                || visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
