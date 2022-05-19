package com.example.application.data.entity;

import javax.persistence.Entity;

import com.example.application.data.AbstractEntity;

/* Class: Status
 * Description: Entity class for Status object, contains the fields: name
 * Author: Raveenth Maheswaran
 * Date: 05/17/2022
 */

@Entity
public class Status extends AbstractEntity {
    private String name;

    public Status() { }

    public Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}