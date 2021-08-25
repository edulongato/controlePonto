package com.dio.controlePonto.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {

    private Long id;
    private String descricao;
    private LocalDateTime dataEspecial;

    private TipoData tipoData;
}
