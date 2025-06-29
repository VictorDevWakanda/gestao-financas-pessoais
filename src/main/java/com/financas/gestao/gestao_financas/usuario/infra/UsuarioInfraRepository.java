package com.financas.gestao.gestao_financas.usuario.infra;

import com.financas.gestao.gestao_financas.usuario.application.repository.UsuarioRepository;
import com.financas.gestao.gestao_financas.usuario.domain.Usuario;
import com.financas.gestao.gestao_financas.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class UsuarioInfraRepository implements UsuarioRepository {

    private final UsuarioSpringDataJPARepository usuarioSpringDataJPARepository;

    @Override
    public Usuario salva(Usuario usuario) {
        log.info("[start] UsuarioInfraRepository - salva");
        try {
            usuarioSpringDataJPARepository.save(usuario);
        } catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST, "Existem dados duplicados", e);
        }
        log.info("[finaliza] AlimentoInfraRepository - salva");
        return usuario;
    }

    @Override
    public Usuario buscaUsuarioPorId(UUID idUsuario) {
        log.info("[start] UsuarioInfraRepository - buscaUsuarioPorId");
        Usuario usuario = usuarioSpringDataJPARepository.findById(idUsuario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Usuario não encontrado!"));
        log.info("[finish] UsuarioInfraRepository - buscaUsuarioPorId");
        return usuario;
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        log.info("[start] UsuarioInfraRepository - deleteUsuario");
        usuarioSpringDataJPARepository.delete(usuario);
        log.info("[finish] UsuarioInfraRepository - deleteUsuario");

    }
}
