package com.financas.gestao.gestao_financas.perfil.application.repository;

import java.util.List;
import java.util.UUID;

import com.financas.gestao.gestao_financas.perfil.domain.Perfil;

public interface PerfilRepository {

    Perfil salvaPerfil(Perfil perfil);

    List<Perfil> buscaPerfisUsuario(UUID idUsuario);

}
