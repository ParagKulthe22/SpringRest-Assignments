package com.example.demo.Service;

import com.example.demo.Repository.SelfRepo;
import com.example.demo.bean.SelfBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class Selfservice {
    @Autowired
    private SelfRepo repository;

    public List<SelfBeans> getAllUsers(){
        List<SelfBeans> SelfList = new ArrayList<SelfBeans>();
        repository.findAll().forEach(x -> SelfList.add(x));
        return SelfList;
    }

    public SelfBeans getUser(int userid)
    {
        List<SelfBeans> userList = new ArrayList<>();
      SelfBeans user1=new SelfBeans();
        repository.findById(userid).get();
        return repository.findById(userid).get();
    }

    public SelfBeans addUser(SelfBeans user){
      SelfBeans u1 = repository.save(user);
        return u1;
    }

    public SelfBeans updateUser(SelfBeans user){
      SelfBeans u2 = repository.save(user);
        return u2;
    }

    public void deleteUser(int userid)
    {
        repository.deleteById(userid);
    }
}