package codigo.java.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode
@Entity
@Table(name = "Setores")
public class Setores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Set_codigo;
    @Column(unique = true)
    private String Set_descricao;
    @Column(unique = true)
    private String Set_funcao;  

    @OneToMany(mappedBy = "fun_contrato", cascade = CascadeType.DETACH)
    private Set<Funcionarios> funcionarios = new HashSet<>();
    
}
