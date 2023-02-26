package com.fstt.shop;
import jakarta.persistence.*;
import java.util.ArrayList;
@Entity(name ="orders")
public class Orders{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne()
    private User user;
    @ManyToMany(mappedBy = "manyOrders")
    private ArrayList<User> users;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public ArrayList<User> getUsers() {
        return users;
    }

    public User getUser() {
        return user;
    }

    public void setUsers(ArrayList<User> users) {
        this.user = user;
    }



}
