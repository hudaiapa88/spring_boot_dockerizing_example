package com.uc.docker.model.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
public class Course extends BaseEntity {
    private String title;
    private String lesson;
    private String description;
    private Long categoryId;
    private Long teacherId;
}
