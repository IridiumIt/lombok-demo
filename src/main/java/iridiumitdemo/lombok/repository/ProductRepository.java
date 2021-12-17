package iridiumitdemo.lombok.repository;

import iridiumitdemo.lombok.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
}
