package com.uc.docker.model.entity;

import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Category extends  BaseEntity{
    String title;

}
