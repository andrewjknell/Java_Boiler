package com.lily.example.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lily.example.models.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long>{
	List<Movie> findAll();
}
