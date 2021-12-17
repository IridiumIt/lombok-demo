package iridiumitdemo.lombok.controller;

import iridiumitdemo.lombok.model.ProductModel;
import iridiumitdemo.lombok.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProductController {
    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/save")
    public ResponseEntity<ProductModel> save(@RequestBody ProductModel product){
        return  ResponseEntity.ok(repository.save(product));
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<ProductModel>> ListAll(){
        return ResponseEntity.ok(repository.findAll());
    }
}
