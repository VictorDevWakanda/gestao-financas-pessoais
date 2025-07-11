package com.financas.gestao.gestao_financas.transacao.application.api;

import com.financas.gestao.gestao_financas.transacao.domain.Tipo;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.math.BigDecimal;

@Value
public class TransacaoRequest {
    @NotBlank
    private String descricao;
    @NotNull
    @DecimalMin("0.01")
    private BigDecimal valor;
    @NotNull
    private Tipo tipo;
}
