package com.dio.controlePonto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class MovimentacaoId implements Serializable{

        private Long idMovimento;
        private Long idUsuario;

    }
    @Id
    @EmbeddedId
    private MovimentacaoId id;

    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    @JoinColumn(name = "ocorrencia_id")
    private Ocorrencia ocorrencia;
    @ManyToOne
    @JoinColumn(name = "calendario_id")
    private Calendario calendario;


}
