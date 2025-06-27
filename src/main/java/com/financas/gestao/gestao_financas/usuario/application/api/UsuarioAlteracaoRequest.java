package com.financas.gestao.gestao_financas.usuario.application.api;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class UsuarioAlteracaoRequest {

    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private String telefone;
}
