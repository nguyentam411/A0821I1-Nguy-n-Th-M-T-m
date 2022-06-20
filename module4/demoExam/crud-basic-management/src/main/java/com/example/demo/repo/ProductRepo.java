package com.example.demo.repo;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    List<Product> getAllByNameContaining(String name);

    List<Product> getAllByPriceGreaterThanEqual(double price);
    @Query(value="select p.* from product p join category c on p.category_id = c.id where c.name like ?1"
            , countQuery = "select count(p.id) from product p join category c on p.category_id = c.id where c.name like ?1", nativeQuery = true)
    List<Product> findByCategoryName(String categoryName);

}
