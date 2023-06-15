package com.xdemo.inheritancehibernate.two_tables.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "first_child1")
public class FirstChild1 extends Parent1 {

    @Column(name = "first_child_field")
    Integer firstChildField;

    @Builder
    public FirstChild1(String commonField, Integer firstChildField) {
        super(commonField);
        this.firstChildField = firstChildField;
    }
}
