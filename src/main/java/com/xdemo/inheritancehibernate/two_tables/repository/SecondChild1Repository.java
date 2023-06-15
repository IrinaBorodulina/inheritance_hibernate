package com.xdemo.inheritancehibernate.two_tables.repository;

import com.xdemo.inheritancehibernate.two_tables.entities.SecondChild1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondChild1Repository extends CrudRepository<SecondChild1, Integer> {

}
