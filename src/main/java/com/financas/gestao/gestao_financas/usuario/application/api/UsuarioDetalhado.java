package com.financas.gestao.gestao_financas.usuario.application.api;

import com.financas.gestao.gestao_financas.usuario.domain.StatusCadastro;
import com.financas.gestao.gestao_financas.usuario.domain.Usuario;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Value
public class UsuarioDetalhado {
    private UUID idUsuario;
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private String telefone;
    private String email;
    private BigDecimal saldo = BigDecimal.ZERO;
    private StatusCadastro statusCadastro;

    public UsuarioDetalhado(Usuario usuario) {
        this.cpf = usuario.getCpf();
        this.dataNascimento = usuario.getDataNascimento();
        this.email = usuario.getEmail();
        this.idUsuario = usuario.getIdUsuario();
        this.nome = usuario.getNome();
        this.statusCadastro = usuario.getStatusCadastro();
        this.telefone = usuario.getTelefone();
    }
}