package com.practice.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingOrder {
	
	public static void main(String[] args){
	Order ord1 = new Order(123, "homedelivery", 1000.00);
	Order ord2 = new Order(103, "online", 34300.00);
	Order ord3 = new Order(153, "c2d", 999.00);
	Order ord4 = new Order(145, "coorporate", 23235.00);
	
	List<Order> orders = new ArrayList<Order>();
	orders.add(ord4);
	orders.add(ord2);
	orders.add(ord3);
	orders.add(ord1);
	
	System.out.println("unsorted::  "+ orders);
	Collections.sort(orders);
	
	System.out.println("natural sort order::  "+ orders);
	
	Collections.sort(orders, Collections.reverseOrder());
	System.out.println("reverse order::  "+ orders);
	
	Collections.sort(orders, new Order.OrderByAmount());
	System.out.println("By Amount::  "+ orders);
	
	Collections.sort(orders, new Order.OrderByType());
	System.out.println("By OrderType ::  "+ orders);
	
	
	}
	
}


