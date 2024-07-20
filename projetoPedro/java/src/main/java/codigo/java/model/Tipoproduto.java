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
@Table(name = "TipoProduto")
public class Tipoproduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tip_codigo;
    @Column(length = 30)
    private String tip_categoria;

    @OneToMany(mappedBy = "pro_codigo", cascade = CascadeType.DETACH)
    private Set<Produtos> produtos = new HashSet<>();
    
}
