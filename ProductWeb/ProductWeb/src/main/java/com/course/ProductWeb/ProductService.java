package com.course.ProductWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Component
@Service //can use any one of them but use @Service in service class/file and @Component in component class/file
public class ProductService {

    @Autowired
    ProductDB db;
    public List<Product> getAllProduct(){
        return db.findAll(); // this method are inbuild no need of sql query this is done by jpa

    }

    public List<Product> getname(String name){
//        return db.findByName(name);
        System.out.println("Searching for product with name = " + name);
        List<Product> p = db.findByNameIgnoreCase(name);
        System.out.println("Result = " + p);
        return p;
    }

    public void addProduct(Product p){
        db.save(p);
    }
    public void show(){
        System.out.println("i am in show");
    }
}



