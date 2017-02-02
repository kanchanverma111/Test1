package app.models;

public class Item {
	
	private int itemId;
	private String itemName;
	private String itemDecscription;
	private int itemPrice;
	
	private Item(){
	}
	
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDecscription() {
		return itemDecscription;
	}
	public void setItemDecscription(String itemDecscription) {
		this.itemDecscription = itemDecscription;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
}
