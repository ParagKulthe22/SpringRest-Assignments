package com.example.demo.Service;


import com.example.demo.Repository.ProductRepo;
import com.example.demo.bean.ProductBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {
    @Autowired
    ProductRepo repository;

    public List<ProductBean> getAllProducts(){
        List<ProductBean> prodList = new ArrayList<>();
        repository.findAll().forEach(x -> prodList.add(x));
        return prodList;
    }

    public ProductBean getProd(int prodid)
    {
        List<ProductBean> prodList = new ArrayList<>();
        ProductBean product=new ProductBean();
        repository.findById(prodid).get();
        return repository.findById(prodid).get();
    }

    public ProductBean addProd(ProductBean product){
        ProductBean p1 = repository.save(product);
        return p1;
    }

    public ProductBean updateProd(ProductBean product){
        ProductBean p2= repository.save(product);
        return p2;
    }

    public void deleteProd(int prodid)
    {
        repository.deleteById(prodid);
    }
}