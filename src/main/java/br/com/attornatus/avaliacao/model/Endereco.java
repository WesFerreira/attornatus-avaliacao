package br.com.attornatus.avaliacao.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "enderecos")
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

}