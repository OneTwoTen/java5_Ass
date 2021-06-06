package com.it15301.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
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
@Table(name = "order_details")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "price")
	private Float price;
	
//	@Column(name = "order_id")
//	private Integer orderId;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "order_id", referencedColumnName = "id")
//	private Order oders;

	@ManyToOne()
	@JoinColumn(
			name = "order_id",
			referencedColumnName = "id"
			)
	private Order order;
	
	@OneToMany(mappedBy = "orderDetail")
	private List<Product> products;
}
