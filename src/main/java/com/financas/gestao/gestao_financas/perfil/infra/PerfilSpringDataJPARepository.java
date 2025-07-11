package com.financas.gestao.gestao_financas.perfil.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financas.gestao.gestao_financas.perfil.domain.Perfil;

public interface PerfilSpringDataJPARepository extends JpaRepository<Perfil, UUID> {

    List<Perfil> findByIdUsuario(UUID idUsuario);

}
