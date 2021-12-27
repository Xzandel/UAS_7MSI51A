package com.BackEnd.UAS.BackendUasApplication.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    private String username;
    @Column(name = "password")
    private String password;
}
