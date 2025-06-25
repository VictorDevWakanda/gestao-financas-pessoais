package com.financas.gestao.gestao_financas.usuario.infra;

import com.financas.gestao.gestao_financas.usuario.application.repository.UsuarioRepository;
import com.financas.gestao.gestao_financas.usuario.domain.Usuario;
import com.financas.gestao.gestao_financas.usuario.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

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

}
