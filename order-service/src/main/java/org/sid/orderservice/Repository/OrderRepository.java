package org.sid.orderservice.Repository;

import org.sid.orderservice.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
