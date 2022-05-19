package com.example.application.data.repository;

import com.example.application.data.entity.Company;

import org.springframework.data.jpa.repository.JpaRepository;

/* Class: CompanyRepository
 * Description: Repository interface for Company object, which provides generic CRUD abstraction
 *              and query method functionality
 * Author: Raveenth Maheswaran
 * Date: 05/17/2022
 */

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}