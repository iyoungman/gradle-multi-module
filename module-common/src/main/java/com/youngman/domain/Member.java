package com.youngman.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by YoungMan on 2019-08-23.
 */

@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    public Member() {
    }

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
