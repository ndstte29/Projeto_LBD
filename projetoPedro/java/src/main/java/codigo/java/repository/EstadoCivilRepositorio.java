package codigo.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codigo.java.model.EstadoCivil;
@Repository
public interface EstadoCivilRepositorio extends JpaRepository<EstadoCivil,Integer> {

}
