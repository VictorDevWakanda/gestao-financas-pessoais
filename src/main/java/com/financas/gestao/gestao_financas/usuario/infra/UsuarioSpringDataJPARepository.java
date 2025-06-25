package com.financas.gestao.gestao_financas.usuario.infra;

import com.financas.gestao.gestao_financas.usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioSpringDataJPARepository extends JpaRepository<Usuario, UUID> {
}
