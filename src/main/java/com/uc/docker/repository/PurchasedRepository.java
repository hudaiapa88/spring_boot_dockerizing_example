package com.uc.docker.repository;

import com.uc.docker.model.entity.Purchased;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PurchasedRepository extends MongoRepository<Purchased,Long> {
}
