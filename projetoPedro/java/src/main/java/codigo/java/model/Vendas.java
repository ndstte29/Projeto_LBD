package codigo.java.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "Vendas")
public class Vendas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ven_codigo;
    @Column
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private String ven_data;

    @ManyToOne
    @JoinColumn(name = "cli_codigo")
    private Clientes clientes;

    @ManyToOne
    @JoinColumn(name = "fun_contrato")
    private Funcionarios funcionarios;

    @OneToMany(mappedBy = "ite_codigo", cascade = CascadeType.DETACH)
    private Set<Itens> itens = new HashSet<>();
}