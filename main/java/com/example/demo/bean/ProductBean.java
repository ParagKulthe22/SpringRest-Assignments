package com.example.demo.bean;


        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.Id;
        import javax.persistence.Table;

@Entity
@Table(name="Product")
public class ProductBean {
    @Id
    @GeneratedValue
    int id;
    String name;
    int price,quantity;

    public ProductBean()
    {}

    public ProductBean(String name, int quantity, int price)
    {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}