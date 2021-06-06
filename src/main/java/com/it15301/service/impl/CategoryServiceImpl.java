package com.it15301.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.it15301.entity.Category;
import com.it15301.repositories.CategoryRepository;
import com.it15301.service.CategoryService;

public class CategoryServiceImpl implements CategoryService{
CategoryRepository categoryRepo;

@Override
public <S extends Category> S save(S entity) {
	return categoryRepo.save(entity);
}

@Override
public <S extends Category> Optional<S> findOne(Example<S> example) {
	return categoryRepo.findOne(example);
}

@Override
public Page<Category> findAll(Pageable pageable) {
	return categoryRepo.findAll(pageable);
}

@Override
public List<Category> findAll() {
	return categoryRepo.findAll();
}

@Override
public List<Category> findAll(Sort sort) {
	return categoryRepo.findAll(sort);
}

@Override
public List<Category> findAllById(Iterable<Integer> ids) {
	return categoryRepo.findAllById(ids);
}

@Override
public Optional<Category> findById(Integer id) {
	return categoryRepo.findById(id);
}

@Override
public <S extends Category> List<S> saveAll(Iterable<S> entities) {
	return categoryRepo.saveAll(entities);
}

@Override
public void flush() {
	categoryRepo.flush();
}

@Override
public <S extends Category> S saveAndFlush(S entity) {
	return categoryRepo.saveAndFlush(entity);
}

@Override
public boolean existsById(Integer id) {
	return categoryRepo.existsById(id);
}

@Override
public <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities) {
	return categoryRepo.saveAllAndFlush(entities);
}

@Override
public <S extends Category> Page<S> findAll(Example<S> example, Pageable pageable) {
	return categoryRepo.findAll(example, pageable);
}

@Override
public void deleteInBatch(Iterable<Category> entities) {
	categoryRepo.deleteInBatch(entities);
}

@Override
public <S extends Category> long count(Example<S> example) {
	return categoryRepo.count(example);
}

@Override
public <S extends Category> boolean exists(Example<S> example) {
	return categoryRepo.exists(example);
}

@Override
public void deleteAllInBatch(Iterable<Category> entities) {
	categoryRepo.deleteAllInBatch(entities);
}

@Override
public long count() {
	return categoryRepo.count();
}

@Override
public void deleteById(Integer id) {
	categoryRepo.deleteById(id);
}

@Override
public void deleteAllByIdInBatch(Iterable<Integer> ids) {
	categoryRepo.deleteAllByIdInBatch(ids);
}

@Override
public void delete(Category entity) {
	categoryRepo.delete(entity);
}

@Override
public void deleteAllById(Iterable<? extends Integer> ids) {
	categoryRepo.deleteAllById(ids);
}

@Override
public void deleteAllInBatch() {
	categoryRepo.deleteAllInBatch();
}

@Override
public Category getOne(Integer id) {
	return categoryRepo.getOne(id);
}

@Override
public void deleteAll(Iterable<? extends Category> entities) {
	categoryRepo.deleteAll(entities);
}

@Override
public void deleteAll() {
	categoryRepo.deleteAll();
}

@Override
public Category getById(Integer id) {
	return categoryRepo.getById(id);
}

@Override
public <S extends Category> List<S> findAll(Example<S> example) {
	return categoryRepo.findAll(example);
}

@Override
public <S extends Category> List<S> findAll(Example<S> example, Sort sort) {
	return categoryRepo.findAll(example, sort);
}

}
