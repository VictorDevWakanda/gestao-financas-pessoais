package com.financas.gestao.gestao_financas.usuario.application.service;

import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioRequest;
import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioResponse;

public interface UsuarioService {
    UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);
}
