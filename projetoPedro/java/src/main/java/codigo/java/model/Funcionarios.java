package codigo.java.model;

import org.springframework.format.annotation.DateTimeFormat;

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
@Table(name = "Funcionarios")
public class Funcionarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fun_contrato;
    @Column(length = 30)
    private String fun_nome;
    @Column(length = 30)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private String fun_nascimento;
    @Column(length = 30)
    private String fun_rg;
    @Column(length = 30,unique = true)
    private String fun_cpf;
    @Column(length = 30)
    private double fun_salario;
    @Column(length = 30)
    private String fun_telefone;
    
    @ManyToOne
    @JoinColumn(name = "est_codigo")
    private EstadoCivil estadocivil;

    @ManyToOne
    @JoinColumn(name = "set_codigo")
    private Setores setores;
}
