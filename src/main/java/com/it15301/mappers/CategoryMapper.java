package com.it15301.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.it15301.dto.CategoryDTO;
import com.it15301.entity.Category;

public class CategoryMapper {
	@Autowired
	private ModelMapper modelMapper;
	public Category convertToEntity(CategoryDTO categoryDTO) {
		Category entity = modelMapper.map(categoryDTO, Category.class);
		return entity;
	}
	public CategoryDTO convertToDTO(Category entity) {
		CategoryDTO categoryDTO = modelMapper.map(entity, CategoryDTO.class);
		return categoryDTO;
	}
}
