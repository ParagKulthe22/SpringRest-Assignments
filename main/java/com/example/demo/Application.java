package com.example.demo;


        import com.example.demo.Repository.SelfRepo;
        import com.example.demo.bean.SelfBeans;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private SelfRepo selfRepo;

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        selfRepo.save(new SelfBeans(" Jagannath"));
        selfRepo.save(new SelfBeans(" Kishor"));
        selfRepo.save(new SelfBeans(" Sanjay "));
        selfRepo.save(new SelfBeans(" Bhushan "));

        System.out.println("\n findall()");
        selfRepo.findAll().forEach(u-> System.out.println(u));

        System.out.println("\n findbyid(1L)");
       selfRepo.findById(2).ifPresent(u-> System.out.println(u));

        System.out.println("\n findbyname('Kishor')");
        selfRepo.findByName("Kishor").forEach(u-> System.out.println(u));
    }

}