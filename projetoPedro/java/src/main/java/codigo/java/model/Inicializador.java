package codigo.java.model;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import codigo.java.repository.EstadoCivilRepositorio;
import jakarta.annotation.PostConstruct;

@Component
public class Inicializador {
    @Autowired
    private EstadoCivilRepositorio estadoCivilRepositorio;

    @PostConstruct
    public void inicializarDados() {
        EstadoCivil dados1 = new EstadoCivil();
        dados1.setEst_descricao("Solteiro");

        EstadoCivil dados2 = new EstadoCivil();
        dados2.setEst_descricao("Casado");
        try {
            estadoCivilRepositorio.saveAll(Arrays.asList(dados1, dados2));
        } catch (DataIntegrityViolationException e) {

        }
    }
}
