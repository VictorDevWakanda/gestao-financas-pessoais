package com.financas.gestao.gestao_financas.usuario.application.service;

import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioAlteracaoRequest;
import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioDetalhado;
import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioRequest;
import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioResponse;

import java.util.UUID;

public interface UsuarioService {
    UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);
    UsuarioDetalhado getUsuarioId(UUID idUsuario);
    void patcAlteracaoUsuario(UUID idUsuario, UsuarioAlteracaoRequest usuarioAlteracaoRequest);
    void deleteUsuario(UUID idUsuario);
}
