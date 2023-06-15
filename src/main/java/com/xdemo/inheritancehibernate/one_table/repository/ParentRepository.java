package com.xdemo.inheritancehibernate.one_table.repository;

import com.xdemo.inheritancehibernate.one_table.entities.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Integer> {

}
