package br.com.attornatus.avaliacao.dto;

public record EnderecoRecord(String cep,
                             String logradouro,
                             Integer numero,
                             String cidade,
                             Boolean principal) {
}
