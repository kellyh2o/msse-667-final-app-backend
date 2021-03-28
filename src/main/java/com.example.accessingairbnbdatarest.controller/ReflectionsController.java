package com.example.accessingairbnbdatarest.controller;

import com.example.accessingairbnbdatarest.repository.*;
import com.example.accessingairbnbdatarest.domain.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listingsAndReviews")
public class ReflectionsController {
  @Autowired
  private ReflectionsRepository repository;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Reflection> getAllListings() {
      return repository.findAll();
  }
}