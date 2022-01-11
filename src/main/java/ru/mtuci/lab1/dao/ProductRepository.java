package ru.mtuci.lab1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.mtuci.lab1.model.Product;

import javax.transaction.Transactional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Product p WHERE p.id = :id")
    int delete(@Param("id") Long id);
}