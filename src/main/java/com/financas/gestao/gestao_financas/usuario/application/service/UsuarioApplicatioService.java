package com.financas.gestao.gestao_financas.usuario.application.service;

import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioAlteracaoRequest;
import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioDetalhado;
import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioRequest;
import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioResponse;
import com.financas.gestao.gestao_financas.usuario.application.repository.UsuarioRepository;
import com.financas.gestao.gestao_financas.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioApplicatioService implements UsuarioService{
    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest) {
    log.info("[start] UsuarioApplicatioService - criaUsuario");
        Usuario usuario = usuarioRepository.salva(new Usuario(usuarioRequest));
    log.info("[finish] UsuarioApplicatioService - criaUsuario");
        return new UsuarioResponse(usuario);
    }

    @Override
    public UsuarioDetalhado getUsuarioId(UUID idUsuario) {
        log.info("[start] UsuarioApplicatioService - getUsuarioId");
        Usuario usuario = usuarioRepository.buscaUsuarioPorId(idUsuario);
        log.info("[finish] UsuarioApplicatioService - getUsuarioId");
        return new UsuarioDetalhado(usuario);
    }

    @Override
    public void patcAlteracaoUsuario(UUID idUsuario, UsuarioAlteracaoRequest usuarioAlteracaoRequest) {

    }
}
