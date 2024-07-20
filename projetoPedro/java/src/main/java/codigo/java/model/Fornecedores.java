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
@Table(name = "Fornecedores")
public class Fornecedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int for_codigo;
    @Column(length = 30)
    private String for_nome;
    @Column(unique = true,length = 30)
    private String for_cnpj;
    @Column(length = 30)
    private String for_endereco;

    @OneToMany(mappedBy = "pro_codigo", cascade = CascadeType.DETACH)
    private Set<Produtos> produtos = new HashSet<>();

}
