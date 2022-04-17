package com.example.demo.Repository;

        import com.example.demo.bean.ProductBean;
        import org.springframework.data.repository.CrudRepository;

        import java.util.List;

public interface ProductRepo extends CrudRepository<ProductBean,Integer>
{
    List<ProductBean> findByName(String name);
}