package com.xdemo.inheritancehibernate.two_tables.repository;

import com.xdemo.inheritancehibernate.InheritanceHibernateApplication;
import com.xdemo.inheritancehibernate.two_tables.entities.FirstChild1;
import com.xdemo.inheritancehibernate.two_tables.entities.SecondChild1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@AutoConfigureTestDatabase
@ContextConfiguration(classes = InheritanceHibernateApplication.class)
class Parent1RepositoryTest {

    @Autowired
    Parent1Repository parent1Repository;

    @Autowired
    FirstChild1Repository firstChild1Repository;

    @Autowired
    SecondChild1Repository secondChild1Repository;

    @Test
    void getAllFromTwoTables() {
        FirstChild1 firstChild1 = FirstChild1
                .builder()
                .firstChildField(12)
                .commonField("common")
                .build();
        SecondChild1 secondChild1 = SecondChild1
                .builder()
                .secondChildField(true)
                .commonField("common2")
                .build();
        parent1Repository.save(firstChild1);
        parent1Repository.save(secondChild1);
        //Сохранены в разных таблицах
        Assertions.assertEquals(2, parent1Repository.count());
        Assertions.assertEquals(1, firstChild1Repository.count());
        Assertions.assertEquals(1, secondChild1Repository.count());
    }
}