package com.uc.docker.mapper;

import com.uc.docker.model.dto.StudentDto;
import com.uc.docker.model.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentDtoMapper extends BaseMapper<Student, StudentDto>{
}
