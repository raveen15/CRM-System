package com.example.application.data.repository;

import com.example.application.data.entity.Status;

import org.springframework.data.jpa.repository.JpaRepository;

/* Class: StatusRepository
 * Description: Repository interface for Status object, which provides generic CRUD abstraction
 *              and query method functionality
 * Author: Raveenth Maheswaran
 * Date: 05/17/2022
 */

public interface StatusRepository extends JpaRepository<Status, Integer> {

}