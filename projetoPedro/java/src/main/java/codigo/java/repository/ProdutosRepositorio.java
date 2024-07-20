package codigo.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codigo.java.model.Produtos;

@Repository
public interface ProdutosRepositorio extends JpaRepository<Produtos,Integer> {

}
