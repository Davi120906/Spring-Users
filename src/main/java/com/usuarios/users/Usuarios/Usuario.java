package com.usuarios.users.Usuarios;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Usuario {

    @Id
    @SequenceGenerator(
        name =  "users_sequence",
        sequenceName = "users_sequence",
        allocationSize = 1
    )
    @GeneratedValue (
        strategy = GenerationType.SEQUENCE,
        generator = "users_sequence"  
    )
    private long id;
    private String name;
    private String email;
    private int age;

    public Usuario(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public Usuario(){}

    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;    
    }
    public String getEmail(){
        return this.email;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAge(int age){
        this.age = age;
    }
}
