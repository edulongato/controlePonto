package com.dio.controlePonto.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class NivelAcesso {

    private Long id;
    private String descricao;
}
