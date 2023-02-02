package br.com.attornatus.avaliacao.model;

import br.com.attornatus.avaliacao.dto.PessoaRecord;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pessoas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private LocalDate dataNascimento;

    @ManyToMany
    @JoinTable(name = "pessoa_endereco", joinColumns = @JoinColumn(name = "pessoa_id"),
            inverseJoinColumns = @JoinColumn(name = "endereco_id"))
    private List<Endereco> endereco = new ArrayList<>();

    public Pessoa(PessoaRecord dados) {
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();
        this.endereco = (List<Endereco>) new Endereco(dados.endereco());
    }
}
