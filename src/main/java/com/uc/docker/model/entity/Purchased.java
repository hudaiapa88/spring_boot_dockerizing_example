package com.uc.docker.model.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
public class Purchased extends BaseEntity{

    private Long studentId;

    private Long courseId;

}
