package com.uc.docker.repository;

import com.uc.docker.model.entity.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher,Long> {
}
