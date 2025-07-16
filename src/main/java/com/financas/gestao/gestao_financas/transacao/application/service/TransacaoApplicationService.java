package com.financas.gestao.gestao_financas.transacao.application.service;

import com.financas.gestao.gestao_financas.transacao.application.api.TransacaoRequest;
import com.financas.gestao.gestao_financas.transacao.application.api.TransacaoResponse;
import com.financas.gestao.gestao_financas.transacao.domain.Transacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class TransacaoApplicationService implements TransacaoService{

    @Override
    public TransacaoResponse criaTransacao(UUID idUsuario,TransacaoRequest transacaoRequest) {
        log.info("[start] TransacaoApplicationService - criaTransacao");
        log.info("[finish] TransacaoApplicationService - criaTransacao");
        return null;
    }
}
