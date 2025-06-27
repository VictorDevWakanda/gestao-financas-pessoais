package com.financas.gestao.gestao_financas.usuario.application.api;

import com.financas.gestao.gestao_financas.usuario.domain.StatusCadastro;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Value
public class UsuarioDetalhado {
    private UUID idUsuario;
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private String telefone;
    private String email;
    private BigDecimal saldo = BigDecimal.ZERO;
    private StatusCadastro statusCadastro;
}
