package com.financas.gestao.gestao_financas.perfil.infra;

import org.springframework.stereotype.Repository;

import com.financas.gestao.gestao_financas.perfil.application.repository.PerfilRepository;
import com.financas.gestao.gestao_financas.perfil.domain.Perfil;

import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class PerfilInfraRepository implements PerfilRepository{

    @Override
    public Perfil salvaPerfil(Perfil perfil) {
        log.info("Salvando perfil: {}", perfil);
        return null;
    }

}
