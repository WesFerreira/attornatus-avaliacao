package br.com.attornatus.avaliacao.repository;

import br.com.attornatus.avaliacao.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository <Endereco, Integer> {
}
