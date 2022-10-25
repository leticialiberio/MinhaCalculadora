package tech.ada.samples.MinhaCalculadora.servico;

import org.springframework.stereotype.Service;
import tech.ada.samples.MinhaCalculadora.resposta.RespostaOperacao;

@Service
public class SubtraiServico {
    public RespostaOperacao executar(Integer primeiro, Integer segundo){
        RespostaOperacao respostaOperacao = new RespostaOperacao();
        respostaOperacao.setOperacao("Subtração-Servico");
        respostaOperacao.setPrimeiro(primeiro);
        respostaOperacao.setSegundo(segundo);
        respostaOperacao.setResultado(primeiro - segundo);
        return respostaOperacao;
    }
}