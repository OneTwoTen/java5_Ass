package com.it15301.entity;


import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="image")
	private String image;
	
	@Column(name="price")
	private Float price;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="avaliable")
	private Integer avaliable;

	@ManyToOne()
	@JoinColumn(
			name="category_id",
			referencedColumnName = "id"
			)
	private Category category;
	
//	@ManyToOne()
//	@JoinColumn(
//			name = "order_detail_id",
//			referencedColumnName = "id"
//			)
//	private OrderDetail orderDetail;
	@OneToMany(mappedBy = "product")
	List<OrderDetail> orderDetails;
}
