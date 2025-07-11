package com.financas.gestao.gestao_financas.transacao.application.api;

import com.financas.gestao.gestao_financas.transacao.domain.Tipo;

import java.math.BigDecimal;
import java.util.UUID;

public class TransacaoResponse {
        private UUID idTransacao;
        private String descricao;
        private BigDecimal valor;
        private Tipo tipo;
        private BigDecimal saldoAnterior;
        private BigDecimal saldoAtual;
}
