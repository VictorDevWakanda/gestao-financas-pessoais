package com.financas.gestao.gestao_financas.usuario.application.api;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/usuario")
public interface UsuarioAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioResponse postUsuario(@Valid @RequestBody UsuarioRequest usuarioRequest);

    @GetMapping(value = "/{idUsuario}")
    @ResponseStatus(code = HttpStatus.OK)
    UsuarioDetalhado getUsuario(@PathVariable UUID idUsuario);

    @PatchMapping(value = "/{idUsuario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchUsuario(@PathVariable UUID idUsuario,
                      @Valid @RequestBody UsuarioAlteracaoRequest usuarioAlteracaoRequest);

    @DeleteMapping(value = "/{idUsuario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deleteUsuario(@PathVariable UUID idUsuario);

}
