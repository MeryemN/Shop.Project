package com.fstt.shop;
import jakarta.persistence.*;
import java.util.ArrayList;


@Entity(name ="users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;
    private String name;
    private  String email;

    @OneToMany(mappedBy = "user")
    private ArrayList<Orders> orders;

    @ManyToMany(cascade = { CascadeType.ALL })
    private ArrayList<Orders> manyOrders;

    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public ArrayList<Orders> getManyOrders() {
        return manyOrders;
    }

    public void setManyOrders(ArrayList<Orders> manyOrders) {
        this.manyOrders = manyOrders;
    }

    public void setOrders(ArrayList<Orders> orders) {
        this.orders = orders;
    }

    public void setId(Long id){
        this.id=id;
    }
    public Long getId() {
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return  name;
    }
    public  void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }
}
