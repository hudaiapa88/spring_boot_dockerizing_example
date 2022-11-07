package com.uc.docker.model.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "user")
@Data
@TypeAlias("teacher")
public class Teacher extends User {

}
