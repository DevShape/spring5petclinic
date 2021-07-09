package guru.springframework.spring5petclinic.repositories;

import guru.springframework.spring5petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}