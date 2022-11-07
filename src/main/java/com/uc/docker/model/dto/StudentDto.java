package com.uc.docker.model.dto;

import com.uc.docker.model.enums.Role;
import lombok.Data;

@Data
public class StudentDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private Role role;
}
