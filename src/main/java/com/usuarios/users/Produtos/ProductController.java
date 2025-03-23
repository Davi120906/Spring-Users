package com.usuarios.users.Produtos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping()
    public List<Product> getProducts(){
        
        return productService.getProducts();
    }
    @PostMapping(path = "register")
    public void registerProduct(@RequestBody Product product){
        productService.registerProduct(product);
    }
}
