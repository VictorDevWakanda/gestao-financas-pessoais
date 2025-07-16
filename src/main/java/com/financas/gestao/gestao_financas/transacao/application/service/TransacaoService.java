package com.financas.gestao.gestao_financas.transacao.application.service;

import com.financas.gestao.gestao_financas.transacao.application.api.TransacaoRequest;
import com.financas.gestao.gestao_financas.transacao.application.api.TransacaoResponse;

import java.util.UUID;

public interface TransacaoService{
    TransacaoResponse criaTransacao(UUID idUsuario,TransacaoRequest transacaoRequest);
}
