package org.sid.orderservice.Repository;

import org.sid.orderservice.Entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {

}
