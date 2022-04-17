package com.example.demo.controller;

import com.example.demo.Service.Selfservice;
import com.example.demo.bean.SelfBeans;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
public class Selfcontroller {
    @Autowired
    Selfservice selfservice;

    @GetMapping("/getallusers")
    List<SelfBeans> getAllUsers()
    {
        System.out.println(" From Getallusers Method ");
        List<SelfBeans> SelfList= selfservice.getAllUsers();
        return SelfList;
    }

    @GetMapping("/getuser/{userid}")
    SelfBeans getUser(@PathVariable("userid") int userid)
    {
        System.out.println(" From Get User Method ");
        return selfservice.getUser(userid);
    }

    @PostMapping("/adduser")
    SelfBeans addUser(@RequestBody SelfBeans user)
    {
        System.out.println("From Add User Method.");
        return selfservice.addUser(user);
    }

    @PutMapping("/updateuser")
    SelfBeans updateUser(@RequestBody SelfBeans user)
    {
        System.out.println(" From Update User Method ");
        return selfservice.updateUser(user);
    }

    @DeleteMapping("/deleteuser/{userid}")
    void deleteUser(@PathVariable("userid") int userid)
    {
        System.out.println(" From Delete User Method ");
        selfservice.deleteUser(userid);
    }
}