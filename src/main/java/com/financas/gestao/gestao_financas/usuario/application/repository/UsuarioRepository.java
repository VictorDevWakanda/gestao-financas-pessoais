package com.financas.gestao.gestao_financas.usuario.application.repository;

import com.financas.gestao.gestao_financas.usuario.domain.Usuario;

import java.util.UUID;

public interface UsuarioRepository {
    Usuario salva(Usuario usuario);
    Usuario buscaUsuarioPorId(UUID idUsuario);
}
