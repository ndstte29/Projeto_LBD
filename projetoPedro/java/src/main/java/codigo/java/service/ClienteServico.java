package codigo.java.service;

import org.springframework.stereotype.Service;

import codigo.java.interfaces.IServico;
import codigo.java.model.Clientes;
import codigo.java.repository.ClientesRepositorio;

@Service
public class ClienteServico implements IServico<Clientes,Integer>{
    ClientesRepositorio cr;

    public ClienteServico(ClientesRepositorio cr){
        this.cr = cr;
    }
    @Override
    public Clientes salvar(Clientes objeto){
        return cr.save(objeto);
    }
    public Object listarTodos() {
        return cr.findAll();
    }
}
