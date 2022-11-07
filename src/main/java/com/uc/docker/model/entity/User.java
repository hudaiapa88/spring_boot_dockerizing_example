package com.uc.docker.model.entity;

import com.uc.docker.model.enums.Role;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "user")
public class User extends BaseEntity{
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private Role role;
}
