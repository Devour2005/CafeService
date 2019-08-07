package com.waiterapp.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Employee implements Serializable {

	private Long employeeId;
	private String firstName;
	private String lastName;
	private List<Table> servingTables = new ArrayList<>();
	private List<Order> orders = new ArrayList<>();

}
