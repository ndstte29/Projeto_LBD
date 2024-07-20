package codigo.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codigo.java.model.Clientes;

@Repository
public interface ClientesRepositorio extends JpaRepository<Clientes,Integer>{

}
