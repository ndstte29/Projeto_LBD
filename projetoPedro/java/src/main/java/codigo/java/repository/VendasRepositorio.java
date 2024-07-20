package codigo.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codigo.java.model.Vendas;
@Repository
public interface VendasRepositorio extends JpaRepository<Vendas,Integer> {

}
