package com.example.demo;

import com.example.demo.Repository.ProductRepo;
import com.example.demo.bean.ProductBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private ProductRepo productRepository;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		productRepository.save(new ProductBean("Maruti",4,3100000));
		productRepository.save(new ProductBean("TVS",20,4400000));
		productRepository.save(new ProductBean("Honda",40,5100000));
		productRepository.save(new ProductBean("Hero",9,990000));

		System.out.println("\n findall()");
		productRepository.findAll().forEach(p-> System.out.println(p));

		System.out.println("\nfindbyid(1L)");
		productRepository.findById(4).ifPresent(p-> System.out.println(p));

		System.out.println("\n findbyname('Hero')");
		productRepository.findByName("Hero").forEach(p-> System.out.println(p));
	}

}