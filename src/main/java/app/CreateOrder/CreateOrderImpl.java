package app.CreateOrder;

import java.time.LocalDateTime;

import app.models.Customer;
import app.models.Item;
import app.order.Order;
import app.order.OrderStatus;

public class CreateOrderImpl implements CreateOrder {

	public void placeOrder(Customer customer, Item[] items)
	{
		Order order = new Order();
		order.setCustomer(customer);
		order.setDate(LocalDateTime.now());
		order.setItem(items);
		order.setOrderStatus(OrderStatus.CONFIRMED);
		//order.setTotalAmount(totalAmount);
		
		
	}
	
	public static void main(String[] args) {
		
		CreateOrderImpl coi = new CreateOrderImpl();
		Customer customer = new Customer();
		Item items[] = new Item[5];
		
		coi.placeOrder(customer, items);
		
	}

}
