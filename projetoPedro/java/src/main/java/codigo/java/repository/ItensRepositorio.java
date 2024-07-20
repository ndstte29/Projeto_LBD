package codigo.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codigo.java.model.Itens;
@Repository
public interface ItensRepositorio extends JpaRepository<Itens,Integer>{

}
