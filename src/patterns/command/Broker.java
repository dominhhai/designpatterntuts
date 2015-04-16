package patterns.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	private List<Order> orderList = new ArrayList<>();
	
	public void takeOrder(Order order) {
		this.orderList.add(order);
	}
	
	public void placeOrders() {
		for (Order order : this.orderList) {
			order.execute();
		}
		
		this.orderList.clear();
	}
	
}
