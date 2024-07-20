package codigo.java.interfaces;

import org.springframework.web.servlet.ModelAndView;

public interface IControlador<T,K> {
    public ModelAndView listarTodos();
    public ModelAndView novo();
    public ModelAndView novo(T objeto);
}
