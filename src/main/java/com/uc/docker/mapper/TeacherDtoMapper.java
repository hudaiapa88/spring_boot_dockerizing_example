package com.uc.docker.mapper;

import com.uc.docker.model.dto.TeacherDto;
import com.uc.docker.model.entity.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherDtoMapper extends BaseMapper<Teacher, TeacherDto>{
}
