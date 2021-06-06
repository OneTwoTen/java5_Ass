package com.it15301.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.it15301.entity.Order;
import com.it15301.repositories.OrderRepository;
import com.it15301.service.OrderService;

public class OrderServiceImpl implements OrderService{
	OrderRepository orderRepo;

	@Override
	public <S extends Order> S save(S entity) {
		return orderRepo.save(entity);
	}

	@Override
	public <S extends Order> Optional<S> findOne(Example<S> example) {
		return orderRepo.findOne(example);
	}

	@Override
	public Page<Order> findAll(Pageable pageable) {
		return orderRepo.findAll(pageable);
	}

	@Override
	public List<Order> findAll() {
		return orderRepo.findAll();
	}

	@Override
	public List<Order> findAll(Sort sort) {
		return orderRepo.findAll(sort);
	}

	@Override
	public List<Order> findAllById(Iterable<Integer> ids) {
		return orderRepo.findAllById(ids);
	}

	@Override
	public Optional<Order> findById(Integer id) {
		return orderRepo.findById(id);
	}

	@Override
	public <S extends Order> List<S> saveAll(Iterable<S> entities) {
		return orderRepo.saveAll(entities);
	}

	@Override
	public void flush() {
		orderRepo.flush();
	}

	@Override
	public <S extends Order> S saveAndFlush(S entity) {
		return orderRepo.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Integer id) {
		return orderRepo.existsById(id);
	}

	@Override
	public <S extends Order> List<S> saveAllAndFlush(Iterable<S> entities) {
		return orderRepo.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Order> Page<S> findAll(Example<S> example, Pageable pageable) {
		return orderRepo.findAll(example, pageable);
	}

	@Override
	public void deleteInBatch(Iterable<Order> entities) {
		orderRepo.deleteInBatch(entities);
	}

	@Override
	public <S extends Order> long count(Example<S> example) {
		return orderRepo.count(example);
	}

	@Override
	public <S extends Order> boolean exists(Example<S> example) {
		return orderRepo.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<Order> entities) {
		orderRepo.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return orderRepo.count();
	}

	@Override
	public void deleteById(Integer id) {
		orderRepo.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		orderRepo.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(Order entity) {
		orderRepo.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		orderRepo.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		orderRepo.deleteAllInBatch();
	}

	@Override
	public Order getOne(Integer id) {
		return orderRepo.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends Order> entities) {
		orderRepo.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		orderRepo.deleteAll();
	}

	@Override
	public Order getById(Integer id) {
		return orderRepo.getById(id);
	}

	@Override
	public <S extends Order> List<S> findAll(Example<S> example) {
		return orderRepo.findAll(example);
	}

	@Override
	public <S extends Order> List<S> findAll(Example<S> example, Sort sort) {
		return orderRepo.findAll(example, sort);
	}
	
}
