package com.xdemo.inheritancehibernate.two_tables.repository;

import com.xdemo.inheritancehibernate.two_tables.entities.FirstChild1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstChild1Repository extends CrudRepository<FirstChild1, Integer> {

}
