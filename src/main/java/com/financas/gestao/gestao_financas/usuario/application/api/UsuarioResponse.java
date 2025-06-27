package com.financas.gestao.gestao_financas.usuario.application.api;

import com.financas.gestao.gestao_financas.usuario.domain.Usuario;
import lombok.Value;

import java.util.UUID;

@Value
public class UsuarioResponse {
    private UUID idUsuario;

    public UsuarioResponse(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
    }
}
