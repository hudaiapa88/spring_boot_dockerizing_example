package com.uc.docker.service;

import com.uc.docker.mapper.CategoryDtoMapper;
import com.uc.docker.model.dto.CategoryDto;
import com.uc.docker.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
@RequiredArgsConstructor
public class CategoryManager {

    private final CategoryDtoMapper categoryDtoMapper;
    private final CategoryRepository categoryRepository;

    public CategoryDto getAll(){
       // return categoryDtoMapper.convert(categoryRepository.query(query-> query.select(category)));
   return null;

    }
}
