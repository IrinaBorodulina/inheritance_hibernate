package com.xdemo.inheritancehibernate.one_table.repository;

import com.xdemo.inheritancehibernate.InheritanceHibernateApplication;
import com.xdemo.inheritancehibernate.one_table.entities.FirstChild;
import com.xdemo.inheritancehibernate.one_table.entities.Parent;
import com.xdemo.inheritancehibernate.one_table.entities.SecondChild;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
@AutoConfigureTestDatabase
@ContextConfiguration(classes = InheritanceHibernateApplication.class)
class ParentRepositoryTest {

    @Autowired
    ParentRepository parentRepository;

    @Test
    void getAll() {
        parentRepository.save(FirstChild
                .builder()
                .firstChildField(12)
                .commonField("common")
                .build());
        parentRepository.save(SecondChild
                .builder()
                .secondChildField(true)
                .commonField("common2")
                .build());
        List<Parent> result = parentRepository.findAll();
        Assertions.assertEquals(2, result.size());
    }
}