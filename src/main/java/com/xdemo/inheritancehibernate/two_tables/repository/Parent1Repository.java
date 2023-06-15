package com.xdemo.inheritancehibernate.two_tables.repository;

import com.xdemo.inheritancehibernate.two_tables.entities.Parent1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Parent1Repository extends JpaRepository<Parent1, String> {

}