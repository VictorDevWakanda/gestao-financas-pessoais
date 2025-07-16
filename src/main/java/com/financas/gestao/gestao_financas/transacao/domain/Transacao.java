package com.financas.gestao.gestao_financas.transacao.domain;

import com.financas.gestao.gestao_financas.transacao.application.api.TransacaoRequest;
import com.financas.gestao.gestao_financas.usuario.domain.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idTransacao")
    private UUID idTransacao;
    @NotBlank
    private String descricao;
    @NotNull
    private BigDecimal valor;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", referencedColumnName = "idUsuario")
    private Usuario usuario;
    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal saldoAnterior;
    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal saldoAtual;

}

