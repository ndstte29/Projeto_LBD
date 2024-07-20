package codigo.java.model;

import java.time.LocalDate;

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
@Table(name = "Clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cli_codigo;
    @Column(length = 30)
    private String cli_nome;
    @Column(length = 30)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate cli_nascimento;
    @Column(length = 30)
    private String cli_rg;
    @Column(unique = true)
    private String cli_cpf;
    @Column(length = 30)
    private String cli_telefone;
    @Column(length = 30)
    private String cli_profissao;
    @Column(length = 30)
    private double cli_salario;

    @ManyToOne
    @JoinColumn(name = "est_codigo")
    private EstadoCivil clienteestadocivil;
}
