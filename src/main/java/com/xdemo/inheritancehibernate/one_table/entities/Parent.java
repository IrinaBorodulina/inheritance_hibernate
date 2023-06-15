package com.xdemo.inheritancehibernate.one_table.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance
@DiscriminatorColumn(name = "ENTITY_TYPE") //Название колонки, где проставляется тип сущности
public abstract class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @SequenceGenerator(name = "seq", sequenceName = "seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "common_field")
    private String commonField;

    public Parent(String commonField) {
        this.commonField = commonField;
    }
}
