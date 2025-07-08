package com.financas.gestao.gestao_financas.perfil.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.financas.gestao.gestao_financas.perfil.application.api.PerfilRequest;
import com.financas.gestao.gestao_financas.perfil.application.api.PerfilResponse;
import com.financas.gestao.gestao_financas.perfil.application.repository.PerfilRepository;
import com.financas.gestao.gestao_financas.perfil.domain.Perfil;
import com.financas.gestao.gestao_financas.usuario.application.service.UsuarioService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class PerfilApplicationService implements PerfilService{

    private final UsuarioService usuarioService;
    
    private final PerfilRepository perfilRepository;

    @Override
    public PerfilResponse criarPerfil(UUID idUsuario, PerfilRequest perfilRequest) {
        log.info("[start] PerfilApplicationService - criarPerfil");
        usuarioService.getUsuarioId(idUsuario);
        Perfil perfil = perfilRepository.salvaPerfil(new Perfil(idUsuario, perfilRequest));
        log.info("[finish] PerfilApplicationService - criarPerfil");
        return new PerfilResponse(perfil.getIdPerfil());
    }

}
