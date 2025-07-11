package com.financas.gestao.gestao_financas.perfil.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.financas.gestao.gestao_financas.perfil.application.repository.PerfilRepository;
import com.financas.gestao.gestao_financas.perfil.domain.Perfil;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class PerfilInfraRepository implements PerfilRepository {

    private final PerfilSpringDataJPARepository perfilSpringDataJPARepository;

    @Override
    public Perfil salvaPerfil(Perfil perfil) {
        log.info("[start] PerfilInfraRepository - salvaPerfil");
        perfilSpringDataJPARepository.save(perfil);
        log.info("[finish] PerfilInfraRepository - salvaPerfil");
        return perfil;
    }

    @Override
    public List<Perfil> buscaPerfisUsuario(UUID idUsuario) {
        log.info("[start] PerfilInfraRepository - buscaPerfisUsuario");
        List<Perfil> perfis = perfilSpringDataJPARepository.findByIdUsuario(idUsuario);
        log.info("[finish] PerfilInfraRepository - buscaPerfisUsuario");
        return perfis;
    }

}
