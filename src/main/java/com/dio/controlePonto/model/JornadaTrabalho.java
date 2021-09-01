package com.dio.controlePonto.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class JornadaTrabalho {

    @Id
    @GeneratedValue
    private Long id;
    private String descricao;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JornadaTrabalho that = (JornadaTrabalho) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 1072517713;
    }
}
