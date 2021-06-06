package com.it15301.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.it15301.entity.Category;

public interface CategoryService {

	<S extends Category> List<S> findAll(Example<S> example, Sort sort);

	<S extends Category> List<S> findAll(Example<S> example);

	Category getById(Integer id);

	void deleteAll();

	void deleteAll(Iterable<? extends Category> entities);

	Category getOne(Integer id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Integer> ids);

	void delete(Category entity);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	void deleteById(Integer id);

	long count();

	void deleteAllInBatch(Iterable<Category> entities);

	<S extends Category> boolean exists(Example<S> example);

	<S extends Category> long count(Example<S> example);

	void deleteInBatch(Iterable<Category> entities);

	<S extends Category> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Category> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Integer id);

	<S extends Category> S saveAndFlush(S entity);

	void flush();

	<S extends Category> List<S> saveAll(Iterable<S> entities);

	Optional<Category> findById(Integer id);

	List<Category> findAllById(Iterable<Integer> ids);

	List<Category> findAll(Sort sort);

	List<Category> findAll();

	Page<Category> findAll(Pageable pageable);

	<S extends Category> Optional<S> findOne(Example<S> example);

	<S extends Category> S save(S entity);

}
