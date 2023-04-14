package com.bibushan.api.repository;

import com.bibushan.api.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.ObjectInput;
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>
{

}
