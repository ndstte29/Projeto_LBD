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

@Entity
@Table(name = "EstadoCivil")
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode
public class EstadoCivil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int est_codigo;
    @Column(length = 30,unique = true)
    private String est_descricao;

    @OneToMany(mappedBy = "clienteestadocivil", cascade = CascadeType.DETACH)
    private Set<Clientes> clientes = new HashSet<>();

    @OneToMany(mappedBy = "fun_contrato", cascade = CascadeType.DETACH)
    private Set<Funcionarios> funcionarios = new HashSet<>();

}