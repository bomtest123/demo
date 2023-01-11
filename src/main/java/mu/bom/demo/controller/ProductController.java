package mu.bom.demo.controller;

import mu.bom.demo.persistence.model.Product;
import mu.bom.demo.persistence.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping("/name/{productName}")
    public List<Product> findByProductName(@PathVariable String productName) {
        return productRepository.findByName(productName);
    }

    @GetMapping("/category/{productCategory}")
    public List<Product> findByproductCategory(@PathVariable String productCategory) {
        return productRepository.findByCategory(productCategory);
    }

    @GetMapping("/{id}")
    public Optional<Product> findOne(@PathVariable Long id) {
        return productRepository.findById(id);
    }
}
