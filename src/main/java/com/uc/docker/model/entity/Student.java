package com.uc.docker.model.entity;

import com.uc.docker.model.enums.Role;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "user")
@Data
@TypeAlias("student")
public class Student extends User{


}
