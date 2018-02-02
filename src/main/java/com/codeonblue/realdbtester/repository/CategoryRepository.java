package com.codeonblue.realdbtester.repository;

import com.codeonblue.realdbtester.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {


}