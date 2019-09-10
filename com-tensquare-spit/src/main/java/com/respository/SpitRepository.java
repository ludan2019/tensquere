package com.respository;

import com.pojo.Spit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpitRepository extends MongoRepository<Spit,String> {
}
