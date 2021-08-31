package com.dio.controlePonto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {

    @Id
    private Long id;
    private String descricao;
    private LocalDateTime dataEspecial;

    @ManyToOne
    @JoinColumn(name = "tipo_data_id")
    private TipoData tipoData;
}
