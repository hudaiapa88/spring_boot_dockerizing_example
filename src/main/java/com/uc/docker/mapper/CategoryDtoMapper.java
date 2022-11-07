package com.uc.docker.mapper;

import com.uc.docker.model.dto.CategoryDto;
import com.uc.docker.model.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryDtoMapper extends BaseMapper<Category, CategoryDto>{
}
