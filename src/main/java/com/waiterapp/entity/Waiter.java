package com.waiterapp.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Waiter implements Serializable {

	private Long waiterId;
	private List<Long> servingTables = new ArrayList<>();
	private List<Order> orders = new ArrayList<>();

}
