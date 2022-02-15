package com.TShell.model.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Host")
public class Host {
    @Id
    private Long id;

    private String title;

    public Host() {}

    public Host(String title) {
        this.title = title;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
