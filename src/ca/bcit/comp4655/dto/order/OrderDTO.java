package ca.bcit.comp4655.dto.order;

import java.io.Serializable;
import java.util.Date;

public class OrderDTO implements Serializable
{
	private static final long serialVersionUID = -5177062454961906808L;
	private long orderId;
	private Date creationDate;
	private String customerName;
	private Float totalAmount;
	
	
	public OrderDTO() 
	{
		super();
	}
	
	public OrderDTO(long orderId, Date creationDate, String customerName,
			Float totalAmount)
	{
		super();
		this.orderId = orderId;
		this.creationDate = creationDate;
		this.customerName = customerName;
		this.totalAmount = totalAmount;
	}

	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	@Override
	public String toString()
	{
		return "Order id: " + orderId + "; Amount:" + totalAmount;
	}
}
