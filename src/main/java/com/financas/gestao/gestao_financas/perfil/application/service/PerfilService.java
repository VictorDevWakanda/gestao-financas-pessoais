package com.financas.gestao.gestao_financas.perfil.application.service;

import java.util.UUID;

import com.financas.gestao.gestao_financas.perfil.application.api.PerfilRequest;
import com.financas.gestao.gestao_financas.perfil.application.api.PerfilResponse;

public interface PerfilService {

    PerfilResponse criarPerfil(UUID idUsuario, PerfilRequest perfilRequest);

}
