package guru.springframework.spring5petclinic.repositories;

import guru.springframework.spring5petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}