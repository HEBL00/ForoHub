package com.alura.foro.dto;

import com.alura.foro.model.Curso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(@NotBlank
                                  String titulo,
                                  @NotBlank
                                  String mensaje,
                                  @NotNull @Valid
                                  Curso curso) {
}
