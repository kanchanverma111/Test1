package app.order;

import java.time.LocalDateTime;

import app.models.Customer;
import app.models.Item;

public class Order {
	public Order(){
	}
	
	private Customer customer;
	
	private Item item[];
	private int orderId;
	private LocalDateTime date;
	private int itemQuantity;
	private int totalAmount;
	
	private OrderStatus orderStatus;
	
	
	public int getOrderNum() {
		return orderId;
	}
	public void setOrderNum(int orderId) {
		this.orderId = orderId;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Item[] getItems() {
		return item;
	}
	public void setItems(Item[] items) {
		this.item = items;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Item[] getItem() {
		return item;
	}
	public void setItem(Item item[]) {
		this.item = item;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	

}
