package com.uc.docker.repository;

import com.uc.docker.model.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course,Long> {
}
