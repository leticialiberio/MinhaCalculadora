package tech.ada.samples.MinhaCalculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.samples.MinhaCalculadora.resposta.RespostaOperacao;
import tech.ada.samples.MinhaCalculadora.servico.SomaServico;
import tech.ada.samples.MinhaCalculadora.servico.SubtraiServico;

@RestController
@RequestMapping("/v1")
public class MeuPrimeiroController {

    @Autowired
    private SomaServico somaServico;
    @Autowired
    private SubtraiServico subtraiServico;

    @GetMapping(path = "/ola/{nome}")
    //http://localhost:8080/v1/ola/
    public String ola(@PathVariable("nome") String nomeParametro) {
        return String.format("Ola %s", nomeParametro);
    }

    @GetMapping(path = "/soma/{first}/{second}")
    //http://localhost:8080/v1/soma/
    public RespostaOperacao somaValores(@PathVariable("first") Integer primeiro, @PathVariable("second") Integer segundo) {
        return somaServico.executar(primeiro, segundo);
    }

    @GetMapping(path = "/subtracao/{first}/{second}")
    //http://localhost:8080/v1/subtracao/
    public RespostaOperacao subtraiValores(@PathVariable("first") Integer primeiro, @PathVariable("second") Integer segundo) {
        return subtraiServico.executar(primeiro, segundo);
    }

    @GetMapping(path = "/multiplicacao/{first}/{second}")
    //http://localhost:8080/v1/multiplicacao/
    public RespostaOperacao multiplicaValores(@PathVariable("first") Integer primeiro, @PathVariable("second") Integer segundo) {
        RespostaOperacao respostaOperacao = new RespostaOperacao();
        respostaOperacao.setOperacao("multiplicação");
        respostaOperacao.setPrimeiro(primeiro);
        respostaOperacao.setSegundo(segundo);
        respostaOperacao.setResultado(primeiro * segundo);
        return respostaOperacao;
    }

    @GetMapping(path = "/divisao/{first}/{second}")
    //http://localhost:8080/v1/divisao/
    public RespostaOperacao dividiValores(@PathVariable("first") Integer primeiro, @PathVariable("second") Integer segundo) {
        RespostaOperacao respostaOperacao = new RespostaOperacao();
        respostaOperacao.setOperacao("divisão");
        respostaOperacao.setPrimeiro(primeiro);
        respostaOperacao.setSegundo(segundo);
        respostaOperacao.setResultado(primeiro / segundo);
        return respostaOperacao;
    }
}