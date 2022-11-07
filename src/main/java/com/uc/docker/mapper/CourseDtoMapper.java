package com.uc.docker.mapper;

import com.uc.docker.model.dto.CourseDto;
import com.uc.docker.model.entity.Course;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseDtoMapper extends BaseMapper<Course, CourseDto>{
}
