package com.financas.gestao.gestao_financas.perfil.application.api;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PerfilRequest {
    @NotNull
    private String nome;
    private String descricao;
    private BigDecimal limiteMensal;
}
