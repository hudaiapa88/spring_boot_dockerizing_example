package com.uc.docker.controller;

import com.uc.docker.mapper.CategoryDtoMapper;
import com.uc.docker.model.dto.CategoryDto;
import com.uc.docker.service.CategoryManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("category")
public class CategoryController {
    private final CategoryManager categoryManager;
    private final CategoryDtoMapper categoryDtoMapper;
    @GetMapping
    public List<CategoryDto> getAll(){
        return categoryManager.getAll();
    }
}
