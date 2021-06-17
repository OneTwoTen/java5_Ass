package com.it15301.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.it15301.entity.User;
import com.it15301.repositories.UserRepository;
import com.it15301.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	UserRepository userrepo;

	@Override
	public <S extends User> S save(S entity) {
		return userrepo.save(entity);
	}

	@Override
	public <S extends User> Optional<S> findOne(Example<S> example) {
		return userrepo.findOne(example);
	}

	@Override
	public Page<User> findAll(Pageable pageable) {
		return userrepo.findAll(pageable);
	}

	@Override
	public List<User> findAll() {
		return userrepo.findAll();
	}

	@Override
	public List<User> findAll(Sort sort) {
		return userrepo.findAll(sort);
	}

	@Override
	public List<User> findAllById(Iterable<Integer> ids) {
		return userrepo.findAllById(ids);
	}

	@Override
	public Optional<User> findById(Integer id) {
		return userrepo.findById(id);
	}

	@Override
	public <S extends User> List<S> saveAll(Iterable<S> entities) {
		return userrepo.saveAll(entities);
	}

	@Override
	public void flush() {
		userrepo.flush();
	}

	@Override
	public <S extends User> S saveAndFlush(S entity) {
		return userrepo.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Integer id) {
		return userrepo.existsById(id);
	}

	@Override
	public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
		return userrepo.saveAllAndFlush(entities);
	}

	@Override
	public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
		return userrepo.findAll(example, pageable);
	}

	@Override
	public void deleteInBatch(Iterable<User> entities) {
		userrepo.deleteInBatch(entities);
	}

	@Override
	public <S extends User> long count(Example<S> example) {
		return userrepo.count(example);
	}

	@Override
	public <S extends User> boolean exists(Example<S> example) {
		return userrepo.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<User> entities) {
		userrepo.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return userrepo.count();
	}

	@Override
	public void deleteById(Integer id) {
		userrepo.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		userrepo.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(User entity) {
		userrepo.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		userrepo.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		userrepo.deleteAllInBatch();
	}

	@Override
	public User getOne(Integer id) {
		return userrepo.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends User> entities) {
		userrepo.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		userrepo.deleteAll();
	}

	@Override
	public User getById(Integer id) {
		return userrepo.getById(id);
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> example) {
		return userrepo.findAll(example);
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
		return userrepo.findAll(example, sort);
	}
	
}
