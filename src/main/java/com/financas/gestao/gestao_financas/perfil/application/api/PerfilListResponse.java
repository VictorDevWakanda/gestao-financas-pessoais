package com.financas.gestao.gestao_financas.perfil.application.api;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.financas.gestao.gestao_financas.perfil.domain.Perfil;

import lombok.Value;

@Value
public class PerfilListResponse {

    private UUID idPerfil;
    private String nome;
    private String descricao;
    private BigDecimal limiteMensal;
    private LocalDateTime dataCriacao;

    public static List<PerfilListResponse> converte(List<Perfil> perfis) {
        return perfis.stream()
                .map(PerfilListResponse::new)
                .collect(Collectors.toList());
    }

    public PerfilListResponse(Perfil perfil) {
        this.idPerfil = perfil.getIdPerfil();
        this.nome = perfil.getNome();
        this.descricao = perfil.getDescricao();
        this.limiteMensal = perfil.getLimiteMensal();
        this.dataCriacao = perfil.getDataCriacao();
    }

}
