package codigo.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codigo.java.model.Tipoproduto;

@Repository
public interface TipoProdutoRepositorio extends JpaRepository<Tipoproduto,Integer> {

}