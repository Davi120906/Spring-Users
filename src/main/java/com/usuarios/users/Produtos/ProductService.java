package com.usuarios.users.Produtos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getProducts(){
        return productRepository.findAll();
    }
    public void registerProduct(Product product){
        productRepository.save(product);
    }

}
