package com.example.accessingairbnbdatarest.repository;

import com.example.accessingairbnbdatarest.domain.Reflection;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "reflections", path = "reflections")
public interface ReflectionsRepository extends MongoRepository<Reflection, String> {

    List<Reflection> findByName(@Param("name") String name);

    Reflection findById(ObjectId id);
}