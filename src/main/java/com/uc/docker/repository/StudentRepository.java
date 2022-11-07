package com.uc.docker.repository;

import com.uc.docker.model.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Long> {
}
