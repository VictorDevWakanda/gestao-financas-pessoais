package com.financas.gestao.gestao_financas.usuario.application.service;

import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioRequest;
import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioApplicatioService implements UsuarioService{

    @Override
    public UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest) {
    log.info("[start] UsuarioApplicatioService - criaUsuario");
    log.info("[finish] UsuarioApplicatioService - criaUsuario");
        return null;
    }
}
