package tech.ada.samples.MinhaCalculadora.servico;

import org.springframework.stereotype.Service;
import tech.ada.samples.MinhaCalculadora.resposta.RespostaOperacao;
@Service
public class SomaServico {
    public RespostaOperacao executar(Integer primeiro, Integer segundo) {
        RespostaOperacao respostaOperacao = new RespostaOperacao();
        respostaOperacao.setOperacao("Soma-Servico");
        respostaOperacao.setPrimeiro(primeiro);
        respostaOperacao.setSegundo(segundo);
        respostaOperacao.setResultado(primeiro + segundo);
        return respostaOperacao;
    }
}
