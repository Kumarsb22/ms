package com.restapis.__SBMS_CONS_PRODU.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapis.__SBMS_CONS_PRODU.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
