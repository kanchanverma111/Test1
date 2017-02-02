package app.CreateOrder;

import app.models.Customer;
import app.models.Item;

public interface CreateOrder
{
	public void placeOrder(Customer customer, Item[] items);

}
