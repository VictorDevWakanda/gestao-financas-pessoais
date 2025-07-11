package com.financas.gestao.gestao_financas.transacao.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacao")
public interface TransacaoAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    TransacaoResponse registraTransacao(@Valid @RequestBody TransacaoRequest transacaoRequest);
}
