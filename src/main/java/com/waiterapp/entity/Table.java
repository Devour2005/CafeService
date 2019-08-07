package com.waiterapp.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Table implements Serializable {

	private Long tableId;
	private Long tableNumber;
	private Order order;
}
