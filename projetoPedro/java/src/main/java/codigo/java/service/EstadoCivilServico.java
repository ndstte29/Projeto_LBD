package codigo.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codigo.java.model.EstadoCivil;
import codigo.java.repository.EstadoCivilRepositorio;

@Service
public class EstadoCivilServico {

    @Autowired
    private EstadoCivilRepositorio estadoCivilRepository;

    public List<EstadoCivil> listarTodos() {
        return estadoCivilRepository.findAll();
    }
}
