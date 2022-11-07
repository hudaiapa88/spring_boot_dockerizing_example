package com.uc.docker.repository;



import com.uc.docker.model.entity.Category;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CategoryRepository extends MongoRepository<Category, Long> {
}
