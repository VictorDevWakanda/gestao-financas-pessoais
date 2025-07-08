 package com.financas.gestao.gestao_financas.perfil.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.financas.gestao.gestao_financas.perfil.application.api.PerfilRequest;


@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idPerfil", nullable = false, unique = true, updatable = false)
    private UUID idPerfil;
    @NotNull
    @Column(nullable = false, length = 100)
    private String nome;
    private String descricao;
    private BigDecimal limiteMensal;
    @NotNull
    @Column(columnDefinition = "uuid", name = "id_usuario", nullable = false)
    private UUID idUsuario;
    private LocalDateTime dataCriacao;


    public Perfil(UUID idUsuario, PerfilRequest perfilRequest) {
        this.idUsuario = idUsuario;
        this.nome = perfilRequest.getNome();
        this.descricao = perfilRequest.getDescricao();
        this.limiteMensal = perfilRequest.getLimiteMensal();
        this.dataCriacao = LocalDateTime.now();
    }
}
