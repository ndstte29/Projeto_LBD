package codigo.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codigo.java.model.Fornecedores;

@Repository
public interface FornecedoresRepositorio extends JpaRepository<Fornecedores,Integer>{

}
