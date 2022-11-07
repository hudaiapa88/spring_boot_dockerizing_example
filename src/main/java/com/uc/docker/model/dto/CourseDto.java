package com.uc.docker.model.dto;

import com.uc.docker.model.entity.Category;
import com.uc.docker.model.entity.Teacher;
import lombok.Data;
@Data
public class CourseDto {
    private String title;
    private String lesson;
    private String description;
    private Category category;
    private Teacher teacher;

}
