package codigo.java.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "Itens")
public class Itens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ite_codigo;
    @Column
    private int ite_qtda;
    @Column(length = 30)
    private String ite_nome;
    @Column
    private double ite_valoruni;
    @Column
    private double ite_valortotal;

    @ManyToOne
    @JoinColumn(name = "ven_codigo")
    private Vendas vendas;

    @ManyToOne
    @JoinColumn(name = "pro_codigo")
    private Produtos produtos;
}
