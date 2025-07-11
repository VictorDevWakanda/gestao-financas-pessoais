package com.financas.gestao.gestao_financas.usuario.application.api;
import lombok.Value;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Value
public class UsuarioRequest {

    @NotBlank(message = "O nome é obrigatório.")
    @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres.")
    private String nome;

    @NotBlank(message = "O email é obrigatório.")
    @Email(message = "O email informado não é válido.")
    private String email;

    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 6, max = 30, message = "A senha deve ter entre 6 e 30 caracteres.")
    private String senha;

    @NotNull(message = "A data de nascimento é obrigatória.")
    private LocalDate dataNascimento;

    @NotBlank(message = "O CPF é obrigatório.")
    private String cpf;

    @Pattern(regexp = "\\d{10,15}", message = "O telefone deve conter entre 10 e 15 dígitos.")
    private String telefone;
}

