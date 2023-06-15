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
@Table(name = "second_child1")
public class SecondChild1 extends Parent1 {

    @Column(name = "second_child_field")
    boolean secondChildField;

    @Builder
    public SecondChild1(String commonField, boolean secondChildField) {
        super(commonField);
        this.secondChildField = secondChildField;
    }
}
