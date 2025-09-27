package com.course.ProductWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/product")
    public List<Product> getAllProduct(){
        return service.getAllProduct();
    }
    @GetMapping("/product/{name}")
    public List<Product> getProduct(@PathVariable String name){
        return service.getname(name);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }
}
