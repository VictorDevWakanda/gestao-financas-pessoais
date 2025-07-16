package com.financas.gestao.gestao_financas.transacao.application.api;

import com.financas.gestao.gestao_financas.transacao.application.service.TransacaoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class TransacaoController implements TransacaoAPI{

    private final TransacaoService transacaoService;

    @Override
    public TransacaoResponse registraTransacao(UUID idUsuario,TransacaoRequest transacaoRequest) {
        log.info("[start] TransacaoController - registraTransacao");
        TransacaoResponse transacaoCreated = transacaoService.criaTransacao(idUsuario,transacaoRequest);
        log.info("[finish] TransacaoController - registraTransacao");
        return transacaoCreated;
    }
}

