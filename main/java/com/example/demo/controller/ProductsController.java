package com.example.demo.controller;


import com.example.demo.Service.ProductsService;
import com.example.demo.bean.ProductBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {
    @Autowired
    ProductsService productsService;

    @GetMapping("/getallproducts")

    List<ProductBean> getAllProd()
    {
        System.out.println("From Getallproducts Method ");
        List<ProductBean> productList= productsService.getAllProducts();
        return productList;
    }

    @GetMapping("/getproduct/{prodid}")
    ProductBean getprod(@PathVariable("prodid") int prodId)
    {
        System.out.println("From Get Product Method ");
        return productsService.getProd(prodId);
    }

    @PostMapping("/addproduct")
    ProductBean addProd(@RequestBody ProductBean product)
    {
        System.out.println("From Add Product Method ");
        return productsService.addProd(product);
    }

    @PutMapping("/updateproduct")
    ProductBean updateProd(@RequestBody ProductBean product)
    {
        System.out.println("From Update Product Method ");
        return productsService.updateProd(product);
    }

    @DeleteMapping("/deleteproduct/{prodid}")
    void deleteProd(@PathVariable("prodid") int prodId)
    {
        System.out.println("From Delete Product Method ");
        productsService.deleteProd(prodId);
    }
}