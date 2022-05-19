package com.example.application.data.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.example.application.data.AbstractEntity;
import org.hibernate.annotations.Formula;


/* Class: Company
 * Description: Entity class for Company object, contains the fields: name, employees, and employeeCount
 * Author: Raveenth Maheswaran
 * Date: 05/17/2022
 */

@Entity
public class Company extends AbstractEntity {
    @NotBlank
    private String name;

    @OneToMany(mappedBy = "company")
    private List<Contact> employees = new LinkedList<>();

    @Formula("(select count(c.id) from Contact c where c.company_id = id)")
    private int employeeCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Contact> employees) {
        this.employees = employees;
    }

    public int getEmployeeCount(){
        return employeeCount;
    }
}