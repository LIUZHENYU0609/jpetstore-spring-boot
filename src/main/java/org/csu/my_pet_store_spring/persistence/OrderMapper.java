package org.csu.my_pet_store_spring.persistence;


import org.csu.my_pet_store_spring.domain.Order;

import java.util.List;

public interface OrderMapper {

  List<Order> getOrdersByUsername(String username);

  Order getOrder(int orderId);
  
  void insertOrder(Order order);
  
  void insertOrderStatus(Order order);

}
