package br.com.attornatus.avaliacao.dto;

import java.time.LocalDate;

public record PessoaRecord(String nome,
                           LocalDate dataNascimento,
                           EnderecoRecord endereco) {
}
