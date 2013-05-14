package com.unimedsci.edc.core.user;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author: Sting
 * @created: 13-5-8 下午4:19
 */

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    @NotNull
    @Size(min = 8, max = 20)
    private String password;

    @Column(unique = true)
    @NotNull
    @Size(min = 8, max = 80)
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
