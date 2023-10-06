package dio.gof.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import dio.gof.model.Telefone;

@Repository
public interface TelefoneRepository extends CrudRepository<Telefone, Long> {

}
