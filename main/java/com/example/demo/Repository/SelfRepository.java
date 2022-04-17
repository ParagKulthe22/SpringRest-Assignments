package com.example.demo.Repository;

import com.example.demo.bean.SelfBeans;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SelfRepo extends CrudRepository<SelfBeans,Integer>
{
    List<SelfBeans> findByName(String name);
}