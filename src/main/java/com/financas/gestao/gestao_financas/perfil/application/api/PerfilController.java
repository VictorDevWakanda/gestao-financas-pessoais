package com.financas.gestao.gestao_financas.perfil.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import com.financas.gestao.gestao_financas.perfil.application.service.PerfilService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PerfilController implements PerfilAPI {

    private final PerfilService perfilService;

    @Override
    public PerfilResponse postPerfil(UUID idUsuario, @Valid PerfilRequest perfilRequest) {
        log.info("[start] PerfilController - postPerfil");
        log.info("[idUsuario] {}", idUsuario);
        PerfilResponse novoPerfil = perfilService.criarPerfil(idUsuario, perfilRequest);
        log.info("[finish] PerfilController - postPerfil");
        return novoPerfil;
    }

}
