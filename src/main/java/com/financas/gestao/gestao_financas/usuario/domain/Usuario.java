package com.financas.gestao.gestao_financas.usuario.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Document(collection = "usuarios")
public class Usuario {

    @Id
    private UUID idUsuario;
    @NotBlank
    private String nome;
    @NotNull
    private LocalDate dataNascimento;
    @CPF(message = "O CPF informado é inválido.")
    @Indexed(unique = true)
    private String cpf;
    private String telefone;
    @NotBlank
    private String email;
    @NotBlank
    private String senha;
    @NotNull
    private BigDecimal saldo = BigDecimal.ZERO;
    private StatusCadastro statusCadastro;

    public Usuario(String cpf, LocalDate dataNascimento, String email, String nome, BigDecimal saldo, String senha, StatusCadastro statusCadastro, String telefone) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.nome = nome;
        this.saldo = saldo != null ? saldo : BigDecimal.ZERO;
        this.senha = senha;
        this.statusCadastro = statusCadastro;
        this.telefone = telefone;
    }
}
