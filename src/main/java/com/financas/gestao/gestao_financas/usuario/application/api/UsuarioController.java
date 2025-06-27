package com.financas.gestao.gestao_financas.usuario.application.api;

import com.financas.gestao.gestao_financas.usuario.application.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Log4j2
@RestController
@RequiredArgsConstructor
public class UsuarioController implements UsuarioAPI{
    private final UsuarioService usuarioService;

    @Override
    public UsuarioResponse postUsuario(UsuarioRequest usuarioRequest) {
    log.info("[start] UsuarioController - postUsuario");
    UsuarioResponse usuarioResponse = usuarioService.criaUsuario(usuarioRequest);
    log.info("[finish] UsuarioController - postUsuario");
    return usuarioResponse;
    }

    @Override
    public UsuarioDetalhado getUsuario(UUID idUsuario) {
        log.info("[start] UsuarioController - getUsuario");
        log.info("[idUsuario] {}", idUsuario);
        UsuarioDetalhado usuarioDetalhado = usuarioService.getUsuarioId(idUsuario);
        log.info("[finish] UsuarioController - getUsuario");
        return usuarioDetalhado;
    }
}
