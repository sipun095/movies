package com.sip.mv.repository;

import com.sip.mv.entity.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface MovieesRepository extends MongoRepository<Movies,Integer> {

}
