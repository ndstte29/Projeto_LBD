package codigo.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import codigo.java.interfaces.IControlador;
import codigo.java.model.Clientes;
import codigo.java.service.ClienteServico;
import codigo.java.service.EstadoCivilServico;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteControle implements IControlador<Clientes, Integer> {
    private ClienteServico cs;
    private EstadoCivilServico ecs;

    public ClienteControle(ClienteServico cs, EstadoCivilServico ecs) {
        this.cs = cs;
        this.ecs = ecs;
    }

    @GetMapping()
    @Override
    public ModelAndView listarTodos() {
        ModelAndView mv = new ModelAndView("/cliente/index.html");
        mv.addObject("cliente", cs.listarTodos());
        return mv;

    }

    @GetMapping("/insere")
    @Override
    public ModelAndView novo() {
        ModelAndView mv = new ModelAndView("cliente/novo.html");
        mv.addObject("cliente", new Clientes());
        mv.addObject("estado_civil", ecs.listarTodos());
        return mv;
    }

    @PostMapping("/insere")
    @Override
    public ModelAndView novo(Clientes objeto) {
        objeto = cs.salvar(objeto);
        return new ModelAndView("redirect:/cliente");
    }
}
