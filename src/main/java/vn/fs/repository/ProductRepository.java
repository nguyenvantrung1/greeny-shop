package vn.fs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.fs.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
