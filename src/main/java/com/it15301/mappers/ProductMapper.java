package com.it15301.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it15301.dto.ProductDTO;
import com.it15301.entity.Product;
@Service
public class ProductMapper {
	@Autowired
	private ModelMapper modelMapper;
	public Product convertToEntity(ProductDTO productDTO) {
		Product entity = modelMapper.map(productDTO, Product.class);
		return entity;
	}
	public ProductDTO convertToDTO(Product entity) {
		ProductDTO productDTO = modelMapper.map(entity, ProductDTO.class);
		return productDTO;
	}
}
