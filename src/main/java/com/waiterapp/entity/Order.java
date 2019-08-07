package com.waiterapp.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Order implements Serializable {

	private Long orderId;
	private Long tableNumber;
	private Date timeOfOrder;
	private boolean isOrderAccepted;
	private boolean isOrderGivenOut;
	private boolean isOrderClosed;
}
