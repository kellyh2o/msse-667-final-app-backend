package com.example.accessingairbnbdatarest.repository;

import com.example.accessingairbnbdatarest.domain.Reflections;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "listingsAndReviews", path = "listingsAndReviews")
public interface ListingsAndReviewsRepository extends MongoRepository<Reflections, String> {

    List<Reflections> findByName(@Param("name") String name);

    Reflections findById(ObjectId id);
}