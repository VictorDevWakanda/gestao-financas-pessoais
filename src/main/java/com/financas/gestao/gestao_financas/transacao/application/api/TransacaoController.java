package com.financas.gestao.gestao_financas.transacao.application.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class TransacaoController implements TransacaoAPI{

    @Override
    public TransacaoResponse registraTransacao(TransacaoRequest transacaoRequest) {
        log.info("[start] TransacaoController - registraTransacao");
        log.info("[finish] TransacaoController - registraTransacao");
        return null;
    }
}

