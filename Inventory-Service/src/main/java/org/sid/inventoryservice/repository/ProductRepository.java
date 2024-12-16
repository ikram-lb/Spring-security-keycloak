package org.sid.inventoryservice.repository;

import org.sid.inventoryservice.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}

