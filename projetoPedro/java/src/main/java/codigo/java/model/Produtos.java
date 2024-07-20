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
@Table(name = "Produtos")
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pro_codigo;
    @Column(length = 30)
    private String pro_nome;
    @Column
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private String pro_validade;
    @Column
    private int pro_saldo;
    @Column
    private double pro_valor;
    @Column(length = 30)
    private String pro_descricao;

    @OneToMany(mappedBy = "ite_codigo", cascade =  CascadeType.DETACH)
    private Set<Itens> itens = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "for_codigo")
    private Fornecedores fornecedores;

    @ManyToOne
    @JoinColumn(name = "tip_codigo")
    private Tipoproduto tipoproduto;

}
