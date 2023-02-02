package br.com.attornatus.avaliacao.repository;

import br.com.attornatus.avaliacao.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository <Pessoa, Integer> {
}
