package com.it15301.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.it15301.entity.Product;
import com.it15301.repositories.ProductReposity;
import com.it15301.service.ProductService;

public class ProductServiceImpl implements ProductService {
	ProductReposity productRepo;
	@Override
	public <S extends Product> S save(S entity) {
		return productRepo.save(entity);
	}

	@Override
	public <S extends Product> Optional<S> findOne(Example<S> example) {
		return productRepo.findOne(example);
	}

	@Override
	public Page<Product> findAll(Pageable pageable) {
		return productRepo.findAll(pageable);
	}

	@Override
	public List<Product> findAll() {
		return productRepo.findAll();
	}

	@Override
	public List<Product> findAll(Sort sort) {
		return productRepo.findAll(sort);
	}

	@Override
	public List<Product> findAllById(Iterable<Integer> ids) {
		return productRepo.findAllById(ids);
	}

	@Override
	public Optional<Product> findById(Integer id) {
		return productRepo.findById(id);
	}

	@Override
	public <S extends Product> List<S> saveAll(Iterable<S> entities) {
		return productRepo.saveAll(entities);
	}

	@Override
	public void flush() {
		productRepo.flush();
	}

	@Override
	public <S extends Product> S saveAndFlush(S entity) {
		return productRepo.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Integer id) {
		return productRepo.existsById(id);
	}

	@Override
	public <S extends Product> List<S> saveAllAndFlush(Iterable<S> entities) {
		return productRepo.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable) {
		return productRepo.findAll(example, pageable);
	}

	@Override
	public void deleteInBatch(Iterable<Product> entities) {
		productRepo.deleteInBatch(entities);
	}

	@Override
	public <S extends Product> long count(Example<S> example) {
		return productRepo.count(example);
	}

	@Override
	public <S extends Product> boolean exists(Example<S> example) {
		return productRepo.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<Product> entities) {
		productRepo.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return productRepo.count();
	}

	@Override
	public void deleteById(Integer id) {
		productRepo.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		productRepo.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(Product entity) {
		productRepo.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		productRepo.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		productRepo.deleteAllInBatch();
	}

	@Override
	public Product getOne(Integer id) {
		return productRepo.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends Product> entities) {
		productRepo.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		productRepo.deleteAll();
	}

	@Override
	public Product getById(Integer id) {
		return productRepo.getById(id);
	}

	@Override
	public <S extends Product> List<S> findAll(Example<S> example) {
		return productRepo.findAll(example);
	}

	@Override
	public <S extends Product> List<S> findAll(Example<S> example, Sort sort) {
		return productRepo.findAll(example, sort);
	}
	
}
