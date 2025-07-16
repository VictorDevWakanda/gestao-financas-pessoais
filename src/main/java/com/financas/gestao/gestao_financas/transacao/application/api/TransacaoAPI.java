package com.financas.gestao.gestao_financas.transacao.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/transacao")
public interface TransacaoAPI {

    @PostMapping("/{idUsuario}/novo-transacao")
    @ResponseStatus(code = HttpStatus.CREATED)
    TransacaoResponse registraTransacao(@PathVariable UUID idUsuario,
                                        @Valid @RequestBody TransacaoRequest transacaoRequest);
}
