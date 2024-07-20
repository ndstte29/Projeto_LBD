package codigo.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codigo.java.model.Funcionarios;
@Repository
public interface FuncionarioRepositorio extends JpaRepository<Funcionarios,Integer>{

}
