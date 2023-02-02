package br.com.attornatus.avaliacao.model;

import br.com.attornatus.avaliacao.dto.EnderecoRecord;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "enderecos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String cidade;
    private Boolean principal;

    @ManyToMany (mappedBy = "endereco")
    private List<Pessoa> pessoa = new ArrayList<>();

    public Endereco(EnderecoRecord dados) {
        this.cep = dados.cep();
        this.logradouro = dados.logradouro();
        this.numero = dados.numero();
        this.cidade = dados.cidade();
        this.principal = dados.principal();
    }
}