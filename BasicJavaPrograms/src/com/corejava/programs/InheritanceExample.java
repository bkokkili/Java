package com.corejava.programs;

class PurchaseOrder {
	void getOrderDeatils() {
		System.out.println("Inside getOrderDetails");
	}

}

class PurchaseOrderItem extends PurchaseOrder {
	void getOrderDeatils() {
		System.out.println("Inside getOrderItemDetails");
	}

}

public class InheritanceExample {
	public static void main(String[] args) {
		PurchaseOrder order =  new PurchaseOrderItem();
		order.getOrderDeatils();
	}

}
