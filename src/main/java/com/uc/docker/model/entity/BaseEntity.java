package com.uc.docker.model.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;


@Data
@SuperBuilder
public class BaseEntity {

    @Transient
    String SEQUENCE_NAME;

    public BaseEntity() {
        this.SEQUENCE_NAME = getClass().getSimpleName().toUpperCase()+"_SEQUENCE";
    }

    @Id
    Long id;
}
