package com.waiterapp.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Order implements Serializable {

	private Long orderId;
	private Long tableNumber;
	private boolean isAccepted;
	private boolean isGiven;
	private boolean isClosed;
}
