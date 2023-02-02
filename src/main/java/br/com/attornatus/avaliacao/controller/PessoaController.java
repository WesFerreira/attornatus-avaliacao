package br.com.attornatus.avaliacao.controller;

import br.com.attornatus.avaliacao.dto.PessoaRecord;
import br.com.attornatus.avaliacao.model.Pessoa;
import br.com.attornatus.avaliacao.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    public void cadastrar (@RequestBody PessoaRecord dados) {
        repository.save(new Pessoa(dados));
    }

}
