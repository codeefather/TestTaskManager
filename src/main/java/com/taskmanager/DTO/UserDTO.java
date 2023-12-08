package com.taskmanager.DTO;

import com.taskmanager.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDTO {
    private final SessionFactory sessionFactory;
    private Long id;
    private String name;
    private String email;
    private String role;

    public UserDTO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public User findById(long id){
        return null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void deleteById(long id){

    }

    public void savaOrUpdate(User user){
        getSession().persist(user);
    }

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

}
