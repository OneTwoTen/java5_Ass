package com.it15301.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.it15301.entity.OrderDetail;
import com.it15301.repositories.OrderDetailRepository;
import com.it15301.service.OrderDetailService;

public class OrderDetailServiceImpl implements OrderDetailService{
OrderDetailRepository orderDetailRepo;

@Override
public <S extends OrderDetail> S save(S entity) {
	return orderDetailRepo.save(entity);
}

@Override
public <S extends OrderDetail> Optional<S> findOne(Example<S> example) {
	return orderDetailRepo.findOne(example);
}

@Override
public Page<OrderDetail> findAll(Pageable pageable) {
	return orderDetailRepo.findAll(pageable);
}

@Override
public List<OrderDetail> findAll() {
	return orderDetailRepo.findAll();
}

@Override
public List<OrderDetail> findAll(Sort sort) {
	return orderDetailRepo.findAll(sort);
}

@Override
public List<OrderDetail> findAllById(Iterable<Integer> ids) {
	return orderDetailRepo.findAllById(ids);
}

@Override
public Optional<OrderDetail> findById(Integer id) {
	return orderDetailRepo.findById(id);
}

@Override
public <S extends OrderDetail> List<S> saveAll(Iterable<S> entities) {
	return orderDetailRepo.saveAll(entities);
}

@Override
public void flush() {
	orderDetailRepo.flush();
}

@Override
public <S extends OrderDetail> S saveAndFlush(S entity) {
	return orderDetailRepo.saveAndFlush(entity);
}

@Override
public boolean existsById(Integer id) {
	return orderDetailRepo.existsById(id);
}

@Override
public <S extends OrderDetail> List<S> saveAllAndFlush(Iterable<S> entities) {
	return orderDetailRepo.saveAllAndFlush(entities);
}

@Override
public <S extends OrderDetail> Page<S> findAll(Example<S> example, Pageable pageable) {
	return orderDetailRepo.findAll(example, pageable);
}

@Override
public void deleteInBatch(Iterable<OrderDetail> entities) {
	orderDetailRepo.deleteInBatch(entities);
}

@Override
public <S extends OrderDetail> long count(Example<S> example) {
	return orderDetailRepo.count(example);
}

@Override
public <S extends OrderDetail> boolean exists(Example<S> example) {
	return orderDetailRepo.exists(example);
}

@Override
public void deleteAllInBatch(Iterable<OrderDetail> entities) {
	orderDetailRepo.deleteAllInBatch(entities);
}

@Override
public long count() {
	return orderDetailRepo.count();
}

@Override
public void deleteById(Integer id) {
	orderDetailRepo.deleteById(id);
}

@Override
public void deleteAllByIdInBatch(Iterable<Integer> ids) {
	orderDetailRepo.deleteAllByIdInBatch(ids);
}

@Override
public void delete(OrderDetail entity) {
	orderDetailRepo.delete(entity);
}

@Override
public void deleteAllById(Iterable<? extends Integer> ids) {
	orderDetailRepo.deleteAllById(ids);
}

@Override
public void deleteAllInBatch() {
	orderDetailRepo.deleteAllInBatch();
}

@Override
public OrderDetail getOne(Integer id) {
	return orderDetailRepo.getOne(id);
}

@Override
public void deleteAll(Iterable<? extends OrderDetail> entities) {
	orderDetailRepo.deleteAll(entities);
}

@Override
public void deleteAll() {
	orderDetailRepo.deleteAll();
}

@Override
public OrderDetail getById(Integer id) {
	return orderDetailRepo.getById(id);
}

@Override
public <S extends OrderDetail> List<S> findAll(Example<S> example) {
	return orderDetailRepo.findAll(example);
}

@Override
public <S extends OrderDetail> List<S> findAll(Example<S> example, Sort sort) {
	return orderDetailRepo.findAll(example, sort);
};

}
