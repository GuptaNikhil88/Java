/**
 * 
 */
package com.practice.sort;

import java.util.Comparator;

/**
 * @author Sony
 *
 */
public class Order implements Comparable<Order> {

	private int orderId;
	private String orderType;
	private double orderAmt;

	public static class OrderByType implements Comparator<Order> {

		@Override
		public int compare(Order o1, Order o2) {

			return o1.orderType.compareTo(o2.orderType);

		}
	}
	
	/*
     * Comparator implementation to Sort Order object based on Amount
     */
    public static class OrderByAmount implements Comparator<Order> {

        @Override
        public int compare(Order o1, Order o2) {
            return o1.orderAmt > o2.orderAmt ? 1 : (o1.orderAmt < o2.orderAmt ? -1 : 0);
        }
    }




	public Order(int orderId, String orderType, double orderAmt) {
		this.orderId = orderId;
		this.orderType = orderType;
		this.orderAmt = orderAmt;

	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public double getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(double orderAmt) {
		this.orderAmt = orderAmt;
	}

	/*
	 * Sorting on orderId is natural sorting for Order.
	 */
	@Override
	public int compareTo(Order o) {
		return this.orderId > o.orderId ? 1 : (this.orderId < o.orderId ? -1
				: 0);
	}

	@Override
	public String toString() {
		return String.valueOf(orderId);
	}

}
