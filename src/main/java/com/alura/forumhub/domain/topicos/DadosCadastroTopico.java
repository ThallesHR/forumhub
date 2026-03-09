package com.alura.forumhub.domain.topicos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTopico(@NotBlank String titulo, @NotBlank String mensagem, @NotNull EstadoTopico estado,
                                  @NotBlank String autor, @NotBlank String curso) {
}
