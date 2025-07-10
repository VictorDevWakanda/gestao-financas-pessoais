package com.financas.gestao.gestao_financas.usuario.domain;

import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioAlteracaoRequest;
import com.financas.gestao.gestao_financas.usuario.application.api.UsuarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idUsuario")
    private UUID idUsuario;
    @NotBlank
    private String nome;
    @NotNull
    private LocalDate dataNascimento;
    @CPF(message = "O CPF informado é inválido.")
    @Column(unique = true)
    private String cpf;
    private String telefone;
    @NotBlank
    private String email;
    @NotBlank
    private String senha;
    @NotNull
    private BigDecimal saldo = BigDecimal.ZERO;
    private StatusCadastro statusCadastro;

    public Usuario(UsuarioRequest usuarioRequest) {
        this.cpf = usuarioRequest.getCpf();
        this.dataNascimento = usuarioRequest.getDataNascimento();
        this.email = usuarioRequest.getEmail();
        this.nome = usuarioRequest.getNome();
        this.senha = usuarioRequest.getSenha();
        this.telefone = usuarioRequest.getTelefone();
    }

    public void altera(UsuarioAlteracaoRequest usuarioAlteracaoRequest) {
        this.nome = usuarioAlteracaoRequest.getNome();
        this.email = usuarioAlteracaoRequest.getEmail();
        this.dataNascimento = usuarioAlteracaoRequest.getDataNascimento();
        this.telefone = usuarioAlteracaoRequest.getTelefone();
    }
}
